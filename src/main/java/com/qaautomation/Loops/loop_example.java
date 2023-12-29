package com.qaautomation.Loops;

public class loop_example {
    public static void main(String[] args) {

        // While loop Example
        // int i = 1;
        // while (i <= 10) {
        // System.out.println(i);
        // i++;

        // }
        // System.out.println("________________________________________________");

        // for (int j = 1; j <= 10; j++) {
        // System.out.println(j);
        // }

        // int i = 1;
        // int j = i++;// Post increment
        // System.out.println(i);
        // System.out.println(j);

        // int x = 2;
        // int y = ++x;// Pre increment
        // System.out.println(x);
        // System.out.println(y);

        // int a = 2;
        // int b = a--; // Post decrement
        // System.out.println(a);
        // System.out.println(b);

        // int c = 3;
        // int d = --c; // pre decrement
        // System.out.println(c);
        // System.out.println(d);

        // int i = 6;

        // while (i <= 5) {
        // i++;
        // System.out.println(i);
        // }

        // do {
        // i;
        // System.out.println(i - 1);
        // } while (i <= 5);

        // int a = 10;
        // int b = 20;

        // System.out.println("befor swap no");
        // System.out.println(a);
        // System.out.println(b);

        // System.out.println("After swap no");
        // System.out.println(a);
        // System.out.println(b);

        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 9; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println("");
        }

    }
}
