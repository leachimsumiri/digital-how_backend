package com.michaelirimus.digitalhow.Services;

import com.michaelirimus.digitalhow.Model.Company;

import java.util.List;

public interface CompanyService {

    void addCompany(Company company);

    List<Company> getAllCompanies();

    Company getCompanyById(Long id);

    void deleteCompanyById(Long id);
}
