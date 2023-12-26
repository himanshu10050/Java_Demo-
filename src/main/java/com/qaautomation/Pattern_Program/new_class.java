package com.qaautomation.Pattern_Program;

public class new_class {
    public static void main(String[] args) {

        int n = 3;
        int n1 = 2;
        int n2 = 1;
        // first upper half

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(n);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(n1);

            }
            for (int j = 1; j <= i; j++) {
                System.out.print(n2);

            }
            System.out.println();

        }

    }
}