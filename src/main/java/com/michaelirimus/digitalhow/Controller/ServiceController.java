package com.michaelirimus.digitalhow.Controller;

import com.michaelirimus.digitalhow.Model.Service.Service;
import com.michaelirimus.digitalhow.Model.Service.ServiceType;
import com.michaelirimus.digitalhow.Services.ServiceServiceImpl;
import com.michaelirimus.digitalhow.Services.ServiceTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController {

    @Autowired
    private ServiceServiceImpl service;

    @Autowired
    private ServiceTypeServiceImpl serviceTypeService;

    @GetMapping(value = "/services")
    public List<Service> getServices() {
        return service.getAllServices();
    }

    @GetMapping(value = "/service-types")
    public List<ServiceType> getServiceTypes() {
        return serviceTypeService.getAllServiceTypes();
    }
}
