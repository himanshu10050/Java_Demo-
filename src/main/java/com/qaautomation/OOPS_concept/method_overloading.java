package com.qaautomation.OOPS_concept;

public class method_overloading {
    public static void main(String[] args) {
        method_overloading obj = new method_overloading();
        obj.sum();
        obj.sum(10);
        obj.sum(15, 23);

    }

    // you can not create a method inside a method
    // suplkicate method-- i.e., same method name with same number of argument are
    // not allwoed
    // method overload ---> when the method name is same with different argument or
    // input paramether within the same class
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
