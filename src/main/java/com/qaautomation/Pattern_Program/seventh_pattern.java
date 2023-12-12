package com.qaautomation.Pattern_Program;

/*
 *      1 
 *      12
 *      123
 *      1234
*
 */

public class seventh_pattern {

    public static void main(String[] args) {

        int n = 5;
        int k = 1;
        for (int i = 1; i <= n - 1; i++) {

            k = 1;
            for (int j = 1; j <= i; j++) {
                System.err.print(k++ + "");
                // k++;
            }
            System.out.println();
        }

    }
}
