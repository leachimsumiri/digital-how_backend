package com.michaelirimus.digitalhow.Model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.michaelirimus.digitalhow.Model.SocialNetwork.SocialNetwork;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
@Entity
@Table(name = "companies")
public class Company implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "is_association", nullable = false)
    private boolean isAssociation;

    @Column(name = "url")
    private String url;

    @OneToMany(
            mappedBy = "company",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<SocialNetwork> socialNetwork;

    @OneToMany(
            mappedBy = "company",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Studio> studios;

    public Company() {}

    public Company(String description, boolean isAssociation, String url) {
        this.description = description;
        this.isAssociation = isAssociation;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAssociation() {
        return isAssociation;
    }

    public void setAssociation(boolean association) {
        isAssociation = association;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<SocialNetwork> getSocialNetwork() {
        return socialNetwork;
    }

    public void setSocialNetwork(List<SocialNetwork> socialNetwork) {
        this.socialNetwork = socialNetwork;
    }

    public List<Studio> getStudios() {
        return studios;
    }

    public void setStudios(List<Studio> studios) {
        this.studios = studios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return id == company.id && isAssociation == company.isAssociation && description.equals(company.description) && Objects.equals(url, company.url) && Objects.equals(socialNetwork, company.socialNetwork) && Objects.equals(studios, company.studios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, isAssociation, url, socialNetwork, studios);
    }
}
