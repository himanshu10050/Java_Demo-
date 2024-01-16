package com.qaautomation.array_exercise;

import java.util.Scanner;

public class Print_String_from_input {

    public static void main(String[] args) {
        try (// Enter the size
                Scanner sc = new Scanner(System.in)) {
            System.out.println("enter size of array");
            int size = sc.nextInt();

            // Store int size in the String array
            System.out.println("enter names : ");
            String names[] = new String[size];

            // Input
            for (int i = 0; i < names.length; i++) {
                names[i] = sc.next();
            }

            // Output
            for (int i = 0; i < names.length; i++) {
                System.out.println("enter the printed names : " + names[i]);
            }
        }

    }
}
