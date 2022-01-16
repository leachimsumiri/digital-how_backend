package com.michaelirimus.digitalhow.Controller;

import com.michaelirimus.digitalhow.Model.Company;
import com.michaelirimus.digitalhow.Services.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    private CompanyServiceImpl companyService;

    @GetMapping("/companies")
    public List<Company> getCompanies() {
        return companyService.getAllCompanies();
    }
}
