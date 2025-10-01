package com.pluralsight;

import java.util.Scanner;

import static com.pluralsight.CellPhone.display;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone c1 = new CellPhone();
        CellPhone c2 = new CellPhone();
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please input your Phone's Model: ");
        c1.setModel(myScanner.nextLine());

        System.out.print("\nPlease input your Phone Number: ");
        c1.setPhoneNumber(myScanner.nextLine());

        System.out.print("\nPlease input the Phone Number you wish to dial: ");
        c2.setPhoneNumber(myScanner.nextLine());

        System.out.println("What is your Phone's Model?: " + c1.getModel() + "\nWhat is your Phone's Number?: " + c1.getPhoneNumber());

        c1.dial("855-555-2222");

        display(c1);
        display(c2);

        c1.dial(c2.getModel());
        c2.dial(c1.getModel());


    }


}
