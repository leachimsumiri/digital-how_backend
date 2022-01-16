package com.michaelirimus.digitalhow.Model;

import javax.persistence.*;

@Entity
@Table(name = "companies")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
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
}
