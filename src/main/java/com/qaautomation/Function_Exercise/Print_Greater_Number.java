package com.qaautomation.Function_Exercise;

import java.util.Scanner;

public class Print_Greater_Number {

    public static void Print_Greater_NumberofTow(int a, int b) {

        if (a > b) {
            System.out.println("A is Greater no. ");
        } else {
            System.out.println("B is Greater no.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  A");
        int a = sc.nextInt();

        System.out.println("Enter  B");
        int b = sc.nextInt();

        Print_Greater_NumberofTow(a, b);
        sc.close();
    }
}
