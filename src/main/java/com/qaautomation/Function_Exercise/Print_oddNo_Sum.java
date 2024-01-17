package com.qaautomation.Function_Exercise;

import java.util.Scanner;

public class Print_oddNo_Sum {

    public static void Print_Odd_Number_Sum(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {

                sum = sum + i;
            }
        }
        System.out.println(sum);
        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Print_Odd_Number_Sum(n);
        sc.close();
    }
}
