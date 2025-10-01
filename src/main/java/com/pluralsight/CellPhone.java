package com.pluralsight;

public class CellPhone {
    private String model;
    private String phoneNumber;
    public CellPhone() {
        String model = "";
        String phoneNumber = "";

    }
    public String getModel() {
        return model;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void dial(String dialNumber) {
        System.out.printf("A phone classified as \"%s\" is calling %s", model, phoneNumber);
    }
}

