package com.qaautomation.Pattern_Program;

// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *
public class Butterfly {
    public static void main(String[] args) {
        int n = 5;
        // first upper half

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.err.print("-");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.err.print("-");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
