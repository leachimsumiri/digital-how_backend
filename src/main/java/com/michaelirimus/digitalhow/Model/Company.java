package com.michaelirimus.digitalhow.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

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

    public Company() {

    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return id == company.id && isAssociation == company.isAssociation && Objects.equals(description, company.description) && Objects.equals(url, company.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, isAssociation, url);
    }
}
