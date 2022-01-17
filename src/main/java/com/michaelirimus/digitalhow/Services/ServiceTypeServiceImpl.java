package com.michaelirimus.digitalhow.Services;

import com.michaelirimus.digitalhow.Model.Service.ServiceType;
import com.michaelirimus.digitalhow.Repositories.ServiceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeServiceImpl implements ServiceTypeService {

    @Autowired
    private ServiceTypeRepository serviceTypeRepository;

    @Override
    public List<ServiceType> getAllServiceTypes() {
        return this.serviceTypeRepository.findAll();
    }
}
