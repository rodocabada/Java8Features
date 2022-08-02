package com.learn.java.data;

public class Address {
    private String street;
    private String interiorNumber;
    private String exteriorNumber;

    public Address(String street, String interiorNumber, String exteriorNumber) {
        this.street = street;
        this.interiorNumber = interiorNumber;
        this.exteriorNumber = exteriorNumber;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getInteriorNumber() {
        return interiorNumber;
    }

    public void setInteriorNumber(String interiorNumber) {
        this.interiorNumber = interiorNumber;
    }

    public String getExteriorNumber() {
        return exteriorNumber;
    }

    public void setExteriorNumber(String exteriorNumber) {
        this.exteriorNumber = exteriorNumber;
    }

    @Override
    public String toString(){
        return String.format("{street='" + street + "', interiorNumber='" + interiorNumber
                + "', exteriorNumber='" + exteriorNumber + "'}");
    }
}
