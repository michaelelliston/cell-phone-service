package com.pluralsight;

public class CellPhone {
    public String model;
    public String phoneNumber;
    public CellPhone() {
        this.model = "";
        this.phoneNumber = "";

    }

    public CellPhone(String model, String phoneNumber) {
        this.model = model;
        this.phoneNumber = phoneNumber;
    }

    //    public CellPhone(String phoneNumber, String model) {
//        this.model = model;
//        phoneNumber = "";
//    }
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
    public void dial(CellPhone phoneNumber) {
        System.out.printf("\nA phone classified as \"%s\" is calling \"%s\".\n", model, phoneNumber.getPhoneNumber());
    }
    public static void display(CellPhone phone) {
        System.out.printf("%s's phone number is %s.\n", phone.getModel(), phone.getPhoneNumber());
    }
    public void dialDouble(String model) {
        System.out.printf("The %s is calling the %s.\n", this.model, model);
    }

}

