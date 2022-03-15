package com.michaelirimus.digitalhow.Controller;

import com.michaelirimus.digitalhow.Model.Company;
import com.michaelirimus.digitalhow.Services.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    private CompanyServiceImpl companyService;

    @GetMapping("/companies")
    public List<Company> getCompanies() {
        return companyService.getAllCompanies();
    }

    @GetMapping("/companiesWithService")
    public List<String> getCompaniesWithService(@RequestParam(name = "service") String serviceDescription) {
        List<Company> companies = companyService.getAllCompaniesWithService(serviceDescription);
        List<String> companyDescriptions = new ArrayList();

        companies.forEach(company -> {
            companyDescriptions.add(company.getDescription());
        });

        return companyDescriptions;
    }

    @GetMapping("/company")
    public Company getCompanyById(@RequestParam Long id) {
        return companyService.getCompanyById(id);
    }
}
