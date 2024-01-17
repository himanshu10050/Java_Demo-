package com.qaautomation.Strings;

import java.util.Scanner;

public class Find_String_length {
    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);

        // // Take input from the user for the number of strings
        // System.out.print("Enter the number of strings: ");
        // int numOfStrings = scanner.nextInt();
        // scanner.nextLine(); // Consume the newline character

        // // Create an array to store user strings
        // String[] userStrings = new String[numOfStrings];

        // // Take input from the user for each string
        // for (int i = 0; i < numOfStrings; i++) {
        // System.out.print("Enter string " + (i + 1) + ": ");
        // userStrings[i] = scanner.nextLine();
        // }

        // // Calculate cumulative length
        // int cumulativeLength = 0;
        // for (String str : userStrings) {
        // cumulativeLength += str.length();
        // }

        // // Display the result
        // System.out.println("\nThe cumulative length of all the strings is: " +
        // cumulativeLength);

        // // Close the scanner
        // scanner.close();

        Scanner sc = new Scanner(System.in);
        // // Take input from the user for the number of strings
        System.out.print("Enter the number of strings: ");
        int numbers = sc.nextInt();
        sc.nextLine();

        // // Create an array to store user strings
        String array1[] = new String[numbers];

        // // Take input from the user for each string
        for (int i = 0; i < numbers; i++) {
            System.out.println("enter string : " + (i + 1) + " :");
            array1[i] = sc.nextLine();
        }

        // // Calculate cumulative length
        int cumulativeLength = 0;
        for (String str : array1) {
            cumulativeLength += str.length();
        }
        // // Display the result
        System.out.println("The cumulative length of all the strings is: " + cumulativeLength);
        sc.close();
    }
}