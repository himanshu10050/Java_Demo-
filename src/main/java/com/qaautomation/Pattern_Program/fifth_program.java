package com.qaautomation.Pattern_Program;

/*
 *      1 
 *      22
 *      333
 *      4444
*
 */
public class fifth_program {

    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n - 1; i++) {

            for (int j = 1; j <= i; j++) {
                System.err.print(i);
            }
            System.out.println("");
        }

    }
}
