package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the first name : ");
        String firstName = sc.next();
        UserDetailsValidation.isValidFirstName(firstName);

        System.out.println("Enter the last name : ");
        String lastName = sc.next();
        UserDetailsValidation.isValidLastName(lastName);
    }
}