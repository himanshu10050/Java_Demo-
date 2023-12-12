package com.qaautomation.If_Else_Loops;

import java.util.Scanner;

public class check_no_even_or_odd {
    public static void main(String[] args) {

        // Example 1: Check whether a number is even or odd using if...else statement
        System.out.println("this is first  program");

        Scanner red = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = red.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even");

        } else {
            System.out.println(num + "  is odd");
        }

        // Example 2: Check whether a number is even or odd using ternary operator
        System.out.println("this is second program");
        Scanner red1 = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = red.nextInt();
        String evenOdd = (num1 % 2 == 0) ? "even" : "odd";

        System.out.println(num1 + " is " + evenOdd);
    }
}