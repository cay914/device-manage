package com.codebattery.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger2 {

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.codebattery"))
				.paths(PathSelectors.any())
				.build();
	}

	private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("device")
                .description("接口文档说明")
                .contact(new Contact("Eric", "", "cay914@gmail.com"))
                .version("1.0")
                .build();
	}
}
