package com.zendikdevelopments.hotelmanagementsystem.models;

import jakarta.persistence.Column;

public class Address extends BaseEntity {
    private String country;
    private String county;
    private String municipality;
    private String town;
    private String addressName;

    public Address() {
    }

    @Column(name = "country", length = 50)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name = "county", length = 50)
    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Column(name = "municipality", length = 50)
    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    @Column(name = "town", length = 50)
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Column(name = "address", length = 150)
    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }
}
