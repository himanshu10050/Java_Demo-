package com.qaautomation.Pattern_Program;

public class twelth_program {

    public static void main(String[] args) {

        int n = 0;

        for (int i = 5; i >= n; i--) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
