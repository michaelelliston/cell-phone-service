package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone c1 = new CellPhone();
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please input your Phone's Model: ");
        c1.setModel(myScanner.nextLine());

        System.out.print("\nPlease input your Phone Number: ");
        c1.setPhoneNumber(myScanner.nextLine());

        System.out.println("What is the Phone's Model?: " + c1.getModel() + "\nWhat is the Phone's Number?: " + c1.getPhoneNumber());

        c1.dial("855-555-2222");


    }
}
