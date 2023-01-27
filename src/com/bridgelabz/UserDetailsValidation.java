package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetailsValidation {

    static void isValidFirstName(String firstName){
        String regex = "^[A-Z]{1}[a-z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);

        if(matcher.matches()){
            System.out.println("valid.");
        }else{
            System.out.println("invalid.");
        }
    }

    static void isValidLastName(String lastName){
        String regex = "^[A-Z]{1}[a-z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);

        if(matcher.matches()){
            System.out.println("valid.");
        }else{
            System.out.println("invalid.");
        }
    }

    static void isValidEmail(String mail) {
        String regex = "^[a-z A-Z 0-9]+([.][a-z A-Z 0-9]{1,})?[@][a-z A-Z]+[.][a-z A-Z]{2,3}([.][a-z A-Z]{1,2})?$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mail);

        if (matcher.matches())
            System.out.println("valid");
        else
            System.out.println("invalid");
    }

    static void isValidMobileNumber(String mobNo) {
        String regex = "^[+]?(91)[\\s][0-9]{10}$"; // 91 {10digit}

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobNo);

        if (matcher.matches())
            System.out.println("valid");
        else
            System.out.println("invalid");
    }

    public static void isValidPassword(String password) {
        String regex = "^[a-z A-Z 0-9 _@./#&+-]{8,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if(matcher.matches()) {
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }
    }
}