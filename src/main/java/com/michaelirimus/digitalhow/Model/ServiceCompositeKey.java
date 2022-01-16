package com.michaelirimus.digitalhow.Model;

import java.io.Serializable;
import java.util.Objects;

public class ServiceCompositeKey implements Serializable {
    private String serviceType;
    private int company;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceCompositeKey that = (ServiceCompositeKey) o;
        return company == that.company && Objects.equals(serviceType, that.serviceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceType, company);
    }
}
