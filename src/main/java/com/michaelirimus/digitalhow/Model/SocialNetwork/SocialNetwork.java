package com.michaelirimus.digitalhow.Model.SocialNetwork;

import com.michaelirimus.digitalhow.Model.Company;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "social_networks")
@IdClass(SocialNetworkCompositeKey.class)
public class SocialNetwork implements Serializable {

    @Id
    @OneToOne
    @JoinColumn(name = "description")
    private SocialNetworkType socialNetworkType;

    @Column(name = "url", nullable = false)
    private String url;

    @Id
    @OneToOne
    @JoinColumn(name = "company_id")
    private Company company;

    public SocialNetwork() {
    }

    public SocialNetwork(SocialNetworkType socialNetworkType, String url, Company company) {
        this.socialNetworkType = socialNetworkType;
        this.url = url;
        this.company = company;
    }

    public SocialNetworkType getSocialNetworkType() {
        return socialNetworkType;
    }

    public void setSocialNetworkType(SocialNetworkType socialNetworkType) {
        this.socialNetworkType = socialNetworkType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        SocialNetwork that = (SocialNetwork) o;
        return Objects.equals(socialNetworkType, that.socialNetworkType) && Objects.equals(url, that.url) && Objects.equals(company, that.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(socialNetworkType, url, company);
    }
}
