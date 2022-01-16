package com.michaelirimus.digitalhow.Controller;

import com.michaelirimus.digitalhow.Model.Service;
import com.michaelirimus.digitalhow.Services.ServiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController {

    @Autowired
    private ServiceServiceImpl service;

    @GetMapping(value = "/services")
    public List<Service> getServices() {
        List<Service> s = service.getAllServices();
        return s;
    }
}
