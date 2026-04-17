package com.pluralsight;

import java.util.Scanner;

public class FullNameParserApp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name in either of the following two formats");
        System.out.println("(1)first last");
        System.out.println("(2)first middle Last");
        int option=input.nextInt();
        if(option == 1){
            input.nextLine();
            System.out.println("Please enter your name: ");
            String fullName = input.nextLine();
            String[] nameFormat = fullName.split(" ");

            // Trim and display for format 1 (first last)
            String firstName = nameFormat[0].trim();
            String lastName = nameFormat[1].trim();

            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
        }
        else if(option == 2){
            input.nextLine();
            System.out.println("Please enter your name: ");
            String fullName = input.nextLine();
            String[] nameFormat = fullName.split(" ");

            // Trim and display for format 2 (first middle last)
            String firstName = nameFormat[0].trim();
            String middleName = nameFormat[1].trim();
            String lastName = nameFormat[2].trim();

            System.out.println("First name: " + firstName);
            System.out.println("Middle name: " + middleName);
            System.out.println("Last name: " + lastName);
        }
        else{
            System.out.println("Pick either option 1 or 2. Please run the program again.");
        }

        input.close();
    }
}
