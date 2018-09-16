package com.test;

import java.util.ArrayList;

public class Office {

    private String name;
    private ArrayList<Address> address = new ArrayList<Address>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Address> getAddress() {
        return address;
    }

    public void addAddress(Address addr) {
        address.add(addr);
    }

    @Override
    public String toString() {
        return "Office [name=" + name + ", address=" + address + "]";
    }
}