package com.michaelirimus.digitalhow.Repositories;

import com.michaelirimus.digitalhow.Model.Service.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceTypeRepository extends JpaRepository<ServiceType, Long> {
}
