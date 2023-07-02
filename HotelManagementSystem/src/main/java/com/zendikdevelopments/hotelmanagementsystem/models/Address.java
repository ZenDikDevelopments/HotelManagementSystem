package com.zendikdevelopments.hotelmanagementsystem.models;

public class Address {
    private long id;
    private String country;
    private String county;
    private String municipality;
    private String town;
    private String addressName;

    public Address(long id, String country, String county, String municipality, String town, String addressName) {
        this.id = id;
        this.country = country;
        this.county = county;
        this.municipality = municipality;
        this.town = town;
        this.addressName = addressName;
    }

    public Address() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }
}
