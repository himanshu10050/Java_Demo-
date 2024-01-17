package com.qaautomation.array_exercise;

import java.util.Scanner;

public class input_output_2d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Rows no.");
        int rows = sc.nextInt();

        System.out.println("enter collumns no.");
        int coll = sc.nextInt();

        int[][] numbers = new int[rows][coll];

        // Find number x
        System.out.println("print x value ");
        int x = sc.nextInt();

        System.out.println("enter number as matrix .");
        // Input// Rows
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < coll; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // Output// rown
        // for (int i = 0; i < rows; i++) {
        // // collums
        // for (int j = 0; j < coll; j++) {
        // System.out.print(numbers[i][j] + " ");
        // }
        // System.out.println();
        // }

        // to find the number x
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coll; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("x is found at location: " + i + " " + j);

                }
            }
        }
        sc.close();
    }
}
