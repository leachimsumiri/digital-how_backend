package com.michaelirimus.digitalhow.Repositories;

import com.michaelirimus.digitalhow.Model.Company;
import com.michaelirimus.digitalhow.Model.Service.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    List<Company> findByServices_ServiceType_Description(String serviceDescription);
}
