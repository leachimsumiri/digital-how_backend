package com.michaelirimus.digitalhow.Model.SocialNetwork;

import java.io.Serializable;
import java.util.Objects;

public class SocialNetworkCompositeKey implements Serializable {
    private String socialNetworkType;
    private int company;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SocialNetworkCompositeKey that = (SocialNetworkCompositeKey) o;
        return company == that.company && Objects.equals(socialNetworkType, that.socialNetworkType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(socialNetworkType, company);
    }
}
