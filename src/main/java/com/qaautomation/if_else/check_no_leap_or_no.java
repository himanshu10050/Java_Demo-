package com.qaautomation.if_else;

import java.util.Scanner;

public class check_no_leap_or_no {
    public static void main(String[] args) {

        // Example 3: check wheather year is leap or not using if...else statement

        System.out.println("this is first program");

        try (Scanner red = new Scanner(System.in)) {
            System.out.println("Enter a year");
            int num = red.nextInt();
            if (num % 4 == 0) {
                System.out.println(num + " is leap year");

            } else {
                System.out.println(num + " is not a leap year");
            }
        }

        // Example 4: check wheather year is leap or not using ternary operator?

        System.out.println("this is second program");

        Scanner red1 = new Scanner(System.in);
        System.out.println("Enter a year");
        int num1 = red1.nextInt();
        String leap = (num1 % 4 == 0) ? "leap year" : " not a leap year";

        System.out.println(num1 + " is " + leap);
        red1.close();
    }
}