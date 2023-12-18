package com.qaautomation.OOPS_concept;

public class method_overloading {
    public static void main(String[] args) {
        method_overloading obj = new method_overloading();
        obj.sum();
        obj.sum(10);
        obj.sum(15, 23);

    }

    public void sum() {
        System.out.println("Sum method -- 0 param");
    }

    public void sum(int i) {
        System.out.println("sum method --- 1 param");
        System.out.println(i);
    }

    public void sum(int k, int j) {
        System.out.println("sum method --- 2 param");
        System.out.println(j + "  " + "  " + k);
    }
}
