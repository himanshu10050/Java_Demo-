package com.qaautomation.OOPS_concept;

public class funtions {
    public static void main(String[] args) {

        funtions obj = new funtions();
        obj.test();
        int l = obj.pqr();
        System.out.println(l);

        String s1 = obj.qw();
        System.out.println(s1);

        obj.divisio(34, 55);

    }

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
