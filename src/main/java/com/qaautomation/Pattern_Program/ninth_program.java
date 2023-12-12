package com.qaautomation.Pattern_Program;

/* 
10987 
654
32
1
*/
public class ninth_program {
    public static void main(String[] args) {

        int n = 4;
        int k = 10;
        for (int i = n; i >= 1; i--) {
            // System.out.println("*");

            for (int j = 1; j <= i; j++) {
                System.err.print(k--);
            }
            System.out.println(" ");
        }

    }
}
