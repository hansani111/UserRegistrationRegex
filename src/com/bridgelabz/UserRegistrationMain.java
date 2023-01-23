package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");

        System.out.println("Enter the first name : ");
        String firstName = sc.next();
        UserDetailsValidation.isValidFirstName(firstName);
    }
}