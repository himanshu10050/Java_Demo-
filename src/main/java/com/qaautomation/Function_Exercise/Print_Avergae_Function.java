package com.qaautomation.Function_Exercise;

import java.util.Scanner;

public class Print_Avergae_Function {

    public static int Print_Average(int a, int b, int c) {
        return (a + b + c) / 3;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print first number ");
        int a = sc.nextInt();

        System.out.println("Print Second  number ");
        int b = sc.nextInt();

        System.out.println("Print third  number ");
        int c = sc.nextInt();

        System.out.println("Print the Average of three numbers is " + Print_Average(a, b, c));
        sc.close();
    }
}
