package com.qaautomation.OOPS_concept;

import java.util.Scanner;

public class funtions {

    public static void prntFactorial(int n) {

        if (n < 0) {
            System.out.println("Invalid Number");
            return;

        }
        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();

        prntFactorial(n);
    }

    // Print Any name Using Function

    // public static void printmyName(String name) {
    // System.out.println(name);
    // return;
    // }

    // public static void main(String[] args) {
    // System.out.println("Enter any name");
    // Scanner sc = new Scanner(System.in);
    // String name = sc.next();
    // printmyName("Retun Value is : " + name);
    // }

    // Print Sum Using Function

    // public static int calculatesum(int a, int b) {
    // int sum = a + b;
    // return sum;

    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter first number ");
    // int a = sc.nextInt();

    // System.out.println("Enter Second number ");
    // int b = sc.nextInt();

    // int sum = a + b;
    // System.out.println("Return sum of 2 numbers is " + sum);

    // }

    // // Print Product Using Function

    // public static int calculateproduct(int a, int b) {
    // return a * b;

    // }

    // public static void main(String[] args) {

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter first number ");
    // int a = sc.nextInt();

    // System.out.println("Enter Second number ");
    // int b = sc.nextInt();

    // System.err.println("Product of 2 numbers is " + calculateproduct(a, b));
    // }

    // public static void main(String[] args) {
    //
    // // String name = sc.next();

    // funtions obj = new funtions();
    // obj.test();
    // int l = obj.pqr();
    // System.out.println(l);

    // String s1 = obj.qw();
    // System.out.println(s1);

    // obj.divisio(34, 55);

    // }

    // Non static methods

    // void -- does not return any value
    // retun type - void
    public void test() { // no input , no output
        System.out.println("test method");
    }

    public int pqr() { // no input, some output
        System.out.println("PQR method");
        int a = 10;
        int b = 20;
        int d = a + b;

        return d;

    }

    public String qw() { // no input, some output
        System.out.println("qw method");
        String s = "selenium";

        return s;
    }

    // return type ----- int
    // x,y --> input parameter/arguments
    public int divisio(int x, int y) {
        System.out.println("division method");
        int d = x / y;

        return d;

    }
}
