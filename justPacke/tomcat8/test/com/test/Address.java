package com.test;

public class Address {
    private String streetName;
    private String streetNumber;
    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public String getStreetNumber() {
        return streetNumber;
    }
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }
    @Override
    public String toString() {
        return "Address [streetName=" + streetName + ", streetNumber=" + streetNumber + "]";
    }
}
