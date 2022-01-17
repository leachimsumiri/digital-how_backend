package com.michaelirimus.digitalhow.Services;

import com.michaelirimus.digitalhow.Repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public List<com.michaelirimus.digitalhow.Model.Service.Service> getAllServices() {
        return this.serviceRepository.findAll();
    }
}
