package com.michaelirimus.digitalhow;

import java.util.List;

public interface CompanyService {

    void addCompany(Company company);

    List<Company> getAllCompanies();

    Company getCompanyById(Long id);

    void deleteCompanyById(Long id);
}
