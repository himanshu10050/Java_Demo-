package com.qaautomation.array;

public class Sum_avg {

    public static void main(String[] args) {

        int[] x = { 12, 16, 23, 53, 53, 43 };
        int sum = 0;
        int average = 0;
        // System.out.println(x[4]);

        // // using for loop
        // for (int i = 0; i < x.length; i++) {
        // sum += x[i];
        // }
        // System.out.println("this is the sum of array " + sum);
        // average = sum / x.length;
        // System.out.println("This is the average of the array " + average);

        // Using for each loop
        for (int k : x) {
            sum += k;

        }
        System.out.println(sum);

        average = sum / x.length;

        System.out.println(average);

    }
}
