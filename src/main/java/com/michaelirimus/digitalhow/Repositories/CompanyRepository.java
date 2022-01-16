package com.michaelirimus.digitalhow.Repositories;

import com.michaelirimus.digitalhow.Model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
