package ua.hillel.lessons.lesson23;

import hillel.ua.ValidatorEmail;
import hillel.ua.ValidatorPhonenumber;

public class Main {
    public static void main(String[] args) {
        System.out.println(ValidatorEmail.isValid("qwe@gmail.com"));
        System.out.println(ValidatorPhonenumber.isValid("1234567890"));
    }
}
