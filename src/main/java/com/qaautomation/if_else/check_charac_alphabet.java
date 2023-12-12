package com.qaautomation.if_else;

import java.util.Scanner;

public class check_charac_alphabet {
    public static void main(String[] args) {

        // Example 7: check wheather a character is alphabets using if else statement

        char c = '*';

        if (c > 'a' && c < 'z' || c > 'A' && c < 'Z') {
            System.out.println(" character is alphabets");
        } else {
            System.out.println(" character is not a alphabets");
        }

        // Example 8: check wheather a character is alphabets using ternary operator?

        // char c = '*';
        // String number = (c > 'a' && c < 'z') || (c > 'A' && c < 'Z') ? "alphabets " :
        // " is not a alphabets";

        // System.out.println(c + " is " + number);

        // //Example 9: check wheather a character is alphabets using isAlphabetic()
        // Method

        // char c = 't';
        // if (Character.isAlphabetic(c)) {
        // System.out.println(c + " is a alphabet");
        // } else {
        // System.out.println(c + " is not a alphabet");
        // }
    }
}
