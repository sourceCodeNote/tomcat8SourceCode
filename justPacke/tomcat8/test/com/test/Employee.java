package com.test;

import java.util.ArrayList;

public class Employee {

    private String firstName;
    private String lastName;
    private ArrayList<Office> offices = new ArrayList<Office>();
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public ArrayList<Office> getOffices() {
        return offices;
    }
    public void addOffices(Office office) {
        offices.add(office);
    }
    @Override
    public String toString() {
        //System.err.println("Employee [firstName=" + firstName + ", lastName=" + lastName + ", offices=" + offices + "]");
        return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", offices=" + offices + "]";
    }
}
