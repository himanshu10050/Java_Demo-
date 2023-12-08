
package com.qaautomation.Learn_java;

/**
 * Swap_numbers
 */
public class Swap_numbers {

    public static void main(String[] args) {
// Example 1: Swap two numbers using temporary variable

        // float f1= 32.3f; 
        // float f2 = 43.2f;
        // System.out.println("Before swap : " );
        // System.out.println("first no. " + f1);
        // System.out.println("Second  no. " + f2);

        // float temp= f1;
        // f1= f2;
        // f2= temp;

        //  System.out.println("After swap : " );
        // System.out.println("first no. " + f1);
        // System.out.println("Second  no. " + f2);


//Example 2: Swap two numbers without using temporary variable
    float f3= 45.7f;
    float f4 =23.5f;

        System.out.println("Before swap : " );
        System.out.println("first no. " + f3);
        System.out.println("Second  no. " + f4);

        f3= f3-f4;
        f4= f3+f4;
        f3= f4-f3;

         System.out.println("After swap : " );
        System.out.println("first no. " + f3);
        System.out.println("Second  no. " + f4);

    }
}