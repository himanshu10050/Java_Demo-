package com.qaautomation.array_exercise;

import java.util.Scanner;

public class Find_Number_From_Array {
    public static void main(String[] args) {

        // Declare Arrays
        // int[] marks = new int[3];
        // int marks[]= new int [3];

        // Array input from Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enteer n number ");
        int size = sc.nextInt();

        int marks[] = new int[size];
        System.out.println(" Enteer the numbers ");

        for (int i = 0; i < marks.length; i++) {

            marks[i] = sc.nextInt();
        }

        System.out.println("Enter search number");
        int x = sc.nextInt();

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == x) {
                System.out.println("Entered numbers are : " + i);
            }

        }
        sc.close();
    }
}
