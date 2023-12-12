package com.qaautomation.if_else;

import java.util.Scanner;

public class check_no_positive_or_negative {
    public static void main(String[] args) {
        // Example 5: check wheather a number is positive or negative using if else
        // statement

        System.out.println("this is first program");

        Scanner red = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = red.nextInt();
        if (num < 0.0) {
            System.out.println(num + " number is negative");

        } else if (num > 0.0) {
            System.out.println(num + " number is postive ");
        } else {
            System.out.println("number is 0");
        }

        // Example 6: check wheather a number is positive or negative using ternary
        // operator?

        System.out.println("this is second program");

        Scanner red1 = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = red1.nextInt();
        String number = (num1 < 0.0) ? "negative number" : " postive number";

        System.out.println(num1 + " is" + number);
    }
}
