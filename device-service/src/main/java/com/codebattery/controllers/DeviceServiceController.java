package com.codebattery.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.codebattery.model.Device;
import com.codebattery.services.DeviceService;

@RestController
@RequestMapping(value="v1/device")
public class DeviceServiceController {
    @Autowired
    private DeviceService deviceService;
    private static final Logger logger = LoggerFactory.getLogger(DeviceServiceController.class);

    @RequestMapping(value="/{deviceId}",method = RequestMethod.GET)
    public Device getDevice( @PathVariable("DeviceId") String deviceId) {
        logger.debug("Looking up data for org {}", deviceId);

        Device device = deviceService.getDevice(deviceId);

        return device;
    }

    @RequestMapping(value="/{deviceId}",method = RequestMethod.PUT)
    public void updateDevice( @PathVariable("deviceId") String deviceId, @RequestBody Device device) {
        deviceService.updateDevice( device );
    }

    @RequestMapping(value="/{deviceId}",method = RequestMethod.POST)
    public void saveDevice(@RequestBody Device device) {
       deviceService.saveDevice( device );
    }

    @RequestMapping(value="/{deviceId}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteDevice( @PathVariable("deviceId") String deviceId,  @RequestBody Device device) {
//        deviceService.deleteOrg( org );
    }
}
