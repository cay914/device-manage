package com.thoughtmechanix.zuulsvr.filters;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.thoughtmechanix.zuulsvr.model.Response;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectSerializer;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;

@Component
public class ResponseFilter extends ZuulFilter{
	
    private static final int  FILTER_ORDER=1;
    private static final boolean  SHOULD_FILTER=true;

//    @Autowired
//    FilterUtils filterUtils;

    @Override
    public String filterType() {
        return FilterUtils.POST_FILTER_TYPE;
    }

    @Override
    public int filterOrder() {
        return FILTER_ORDER;
    }

    @Override
    public boolean shouldFilter() {
        return SHOULD_FILTER;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.getResponse().addHeader(FilterUtils.CORRELATION_ID, FilterUtils.getCorrelationId());
        
        InputStream stream = ctx.getResponseDataStream();
        String bodyStr;
		try {
			ObjectMapper mapper = new ObjectMapper();  
			bodyStr = StreamUtils.copyToString(stream, Charset.forName("UTF-8"));
			HashMap jsonMap = mapper.readValue(bodyStr, HashMap.class); 
			Response response = new Response("200", "", jsonMap);
			
			ctx.setResponseBody(mapper.writeValueAsString(response));
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        return null;
    }
}
