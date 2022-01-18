package com.michaelirimus.digitalhow.Services;

import com.michaelirimus.digitalhow.Model.Company;
import com.michaelirimus.digitalhow.Model.Service.ServiceType;
import com.michaelirimus.digitalhow.Repositories.CompanyRepository;
import com.michaelirimus.digitalhow.Repositories.ServiceRepository;
import com.michaelirimus.digitalhow.Repositories.ServiceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> getAllCompanies() {
        return this.companyRepository.findAll();
    }

    public List<Company> getAllCompaniesWithService(String serviceDescription) {
        return this.companyRepository.findByServices_ServiceType_Description(serviceDescription);
    }
}
