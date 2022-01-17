package com.michaelirimus.digitalhow.Model.Service;

import com.michaelirimus.digitalhow.Model.Company;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "services")
@IdClass(ServiceCompositeKey.class)
public class Service implements Serializable {

    @Id
    @OneToOne
    @JoinColumn(name = "description")
    private ServiceType serviceType;

    @Column(name = "in_house")
    private boolean inHouse;

    @Id
    @OneToOne
    @JoinColumn(name = "company_id")
    private Company company;

    public Service() {
    }

    public Service(ServiceType serviceType, boolean inHouse, Company company) {
        this.serviceType = serviceType;
        this.inHouse = inHouse;
        this.company = company;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public boolean isInHouse() {
        return inHouse;
    }

    public void setInHouse(boolean inHouse) {
        this.inHouse = inHouse;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return inHouse == service.inHouse && Objects.equals(serviceType, service.serviceType) && Objects.equals(company, service.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceType, inHouse, company);
    }
}
