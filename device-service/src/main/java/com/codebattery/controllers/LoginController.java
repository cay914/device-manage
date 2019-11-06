package com.codebattery.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codebattery.model.Member;
import com.codebattery.services.UserService;

@RestController
@RequestMapping(value="login")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    
    @Autowired
    private UserService userService;

    @RequestMapping(value="",method = RequestMethod.POST)
//    @ResponseBody
//    public Member login(@RequestBody LoginInfo info) {
    public Member login() {
        logger.debug("登录");

        Member m = userService.login(582L);
		return m;
    }

//    @RequestMapping(value="/{deviceId}",method = RequestMethod.PUT)
//    public void updateDevice( @PathVariable("deviceId") String deviceId, @RequestBody Device device) {
//        deviceService.updateDevice( device );
//    }
//
//    @RequestMapping(value="/{deviceId}",method = RequestMethod.POST)
//    public void saveDevice(@RequestBody Device device) {
//       deviceService.saveDevice( device );
//    }
//
//    @RequestMapping(value="/{deviceId}",method = RequestMethod.DELETE)
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteDevice( @PathVariable("deviceId") String deviceId,  @RequestBody Device device) {
////        deviceService.deleteOrg( org );
//    }
}
