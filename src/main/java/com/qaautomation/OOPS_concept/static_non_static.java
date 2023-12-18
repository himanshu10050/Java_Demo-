package com.qaautomation.OOPS_concept;

public class static_non_static {

    String name = "himanshu";
    static int age = 35;

    public static void main(String[] args) {
        // How to call static method and var?
        // 1. direct calling
        sum();
        System.out.println(age);

        // 2.call by classname
        static_non_static.sum();
        System.out.println(static_non_static.age);

        // How to call non-static method and var?
        // 1. sing object
        static_non_static obj = new static_non_static();
        obj.sendmail();
        System.out.println(obj.name);

    }

    public void sendmail() {
        System.out.println("send mail method");
    }

    public static void sum() {
        System.out.println("sum method");
    }
}
