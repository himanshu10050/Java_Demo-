package com.qaautomation.Function_Exercise;

import java.util.Scanner;

public class circumference_Of_circle {

    public static void circle_circumference(double r) {
        double p = 3.14;

        double c = 2 * p * r;
        System.out.println(c);

        return;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius");
        double r = sc.nextDouble();

        circle_circumference(r);
    }
}