package com.michaelirimus.digitalhow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public void addCompany(Company company) {
        this.companyRepository.save(company);
    }

    @Override
    public List<Company> getAllCompanies() {
        return this.companyRepository.findAll();
    }

    @Override
    public Company getCompanyById(Long id) {
        return this.companyRepository.getById(id);
    }

    @Override
    public void deleteCompanyById(Long id) {
        this.companyRepository.deleteById(id);
    }
}
