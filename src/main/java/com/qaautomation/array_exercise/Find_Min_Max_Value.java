package com.qaautomation.array_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Min_Max_Value {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array : ");
            int size = sc.nextInt();

            int numbers[] = new int[size];
            System.out.println("Enter the numbers");

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = sc.nextInt();
            }

            Arrays.sort(numbers);

            int min = Integer.MIN_VALUE;
            int max = Integer.MAX_VALUE;

            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
                // if (numbers[i] < min) {
                // min = numbers[i];
                // }
                // if (numbers[i] > max) {
                // max = numbers[i];
                // }
            }
        }

        // System.out.println("Largest number is : " + max);
        // System.out.println("Smallest number is : " + min);

    }
}
