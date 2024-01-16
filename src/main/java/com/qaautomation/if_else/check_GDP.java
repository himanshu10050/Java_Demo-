package com.qaautomation.if_else;

import java.util.Scanner;

public class check_GDP {
    public static void main(String[] args) {

        // // Example 10: Find GCD of two numbers using for loop and if statement

        // Scanner sc1 = new Scanner(System.in);
        // System.out.println("Enter first number ");
        // int num1 = sc1.nextInt();

        // Scanner sc2 = new Scanner(System.in);
        // System.out.println("Enter second number ");
        // int num2 = sc1.nextInt();

        // int gc = 1;
        // for (int i = 1; i <= num1 && i <= num2; i++) {
        // if (num1 % i == 0 && num2 % i == 0) {
        // gc = i;
        // }

        // }
        // System.out.println(gc);

        try (// // Example 11: Find GCD of two numbers using for loop and if statement
                Scanner sc1 = new Scanner(System.in)) {
            System.out.println("Enter first number ");
            int num1 = sc1.nextInt();

            System.out.println("Enter second  number ");
            int num2 = sc1.nextInt();

            while (num1 != num2) {

                if (num1 > num2) {
                    num1 -= num2;
                }

                else {
                    num2 -= num1;
                }
            }

            System.out.println("GCD: " + num1);
        }
    }
}
