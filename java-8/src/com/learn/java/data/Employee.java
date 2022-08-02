package com.learn.java.data;

public class Employee {
    private String name;
    private String lastName;
    private Address address;

    public Employee(String name, String lastName, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Employee:{name= '" + name + "', lastName= '" + lastName + "', address=" + address + "}");
    }
}
