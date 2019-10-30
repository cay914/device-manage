package com.codebattery.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codebattery.model.Device;

import java.util.List;

@Repository
public interface DeviceRepository extends CrudRepository<Device,String>  {
    public Device findById(String id);
}
