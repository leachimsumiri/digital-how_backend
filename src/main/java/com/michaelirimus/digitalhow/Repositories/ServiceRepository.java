package com.michaelirimus.digitalhow.Repositories;

import com.michaelirimus.digitalhow.Model.Service.Service;
import com.michaelirimus.digitalhow.Model.Service.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {
    List<Service> findByServiceType(ServiceType serviceType);
}
