package com.qaautomation.Pattern_Program;

public class new_number_pattern {
    public static void main(String[] args) {

        int n = 4;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                // for (int k = 1; k <= i; k++) {
                // System.out.print(j);
                // }
            }
            System.out.println(" ");
        }
    }
}