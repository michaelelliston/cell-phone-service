package com.pluralsight;

public class CellPhone {
    private String model;
    private String phoneNumber;
    public CellPhone() {
        this.model = "";
        this.phoneNumber = "";

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
        System.out.printf("A phone classified as \"%s\" is calling \"%s\".\n", model, dialNumber);
    }
    public static void display(CellPhone phone) {
        System.out.printf("%s's phone number is %s.\n", phone.getModel(), phone.getPhoneNumber());
    }
    public void dialDouble(CellPhone modelBeingDialed) {
        System.out.printf("The %s is calling the %s.", this.model, modelBeingDialed.getModel());
    }

}

