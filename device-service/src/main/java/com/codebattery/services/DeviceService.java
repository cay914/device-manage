package com.codebattery.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebattery.events.source.SimpleSourceBean;
import com.codebattery.model.Device;
import com.codebattery.repository.DeviceRepository;

@Service
public class DeviceService {
    @Autowired
    private DeviceRepository deviceRepository;

    @Autowired
    SimpleSourceBean simpleSourceBean;
    public Device getDevice(String deviceanizationId) {
    	
        return deviceRepository.findById(deviceanizationId);
    }

    public void saveDevice(Device device){
        device.setId( UUID.randomUUID().toString());

        deviceRepository.save(device);
        simpleSourceBean.publishOrgChange("SAVE", device.getId());
    }

    public void updateDevice(Device device){
        deviceRepository.save(device);
        simpleSourceBean.publishOrgChange("UPDATE", device.getId());

    }

    public void deleteDevice(Device device){
        deviceRepository.delete( device.getId());
//        simpleSourceBean.publishOrgChange("DELETE", device.getId());
    }
}
