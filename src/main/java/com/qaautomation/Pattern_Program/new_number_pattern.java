package com.qaautomation.Pattern_Program;

public class new_number_pattern {
    public static void main(String[] args) {
        // int n = 5;
        // for (int i = 1; i <= n; i++) {

        // for (int j = i; j <= i; j++) {
        // System.out.print(i);

        // // for (int k = i; k <= i; k++) {
        // // System.out.print(i);
        // // }
        // }
        // System.out.println();

        // }
        // }
        // }
        int n = 4;
        int k = 1;
        for (int i = 1; i <= n; i++) {
            // System.out.println("*");

            for (int j = 1; j <= i; j++) {
                System.err.print(k++);
            }
            System.out.println(" ");
        }
    }
}