package com.pluralsight;

import static com.pluralsight.CellPhone.display;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone c1 = new CellPhone();
        CellPhone c2 = new CellPhone();
        CellPhone c3 = new CellPhone();

        System.out.print("Please input your Phone's Model: ");
        c1.setModel("iPhone 15");

        System.out.print("\nPlease input your Phone Number: ");
        c1.setPhoneNumber("123-456-7890");

        System.out.print("\nPlease input the Phone Number you wish to dial: ");
        c2.setPhoneNumber("987-654-3210");
        c2.setModel("Samsung Galaxy");
        c3.setModel("Landline");
        c3.setPhoneNumber("543-678-9021");

        System.out.println("What is your Phone's Model?: " + c1.getModel() + "\nWhat is your Phone's Number?: " + c1.getPhoneNumber());

        c1.dial(c3);

        display(c1);
        display(c2);
        display(c3);

        c1.dial(c2.getModel());
        c2.dial(c1.getModel());
        c3.dial(c1.getModel());
        System.out.println("This is the double: ");
        c1.dialDouble(c2.getModel());

        c1.dial(c3.getPhoneNumber());


    }


}
