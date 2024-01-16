package com.qaautomation.OOPS_concept;

public class local_global_var {
    // Global var---- class var
    String name = "Himanshu";
    int age = 25;

    public static void main(String[] args) {

        int i = 10; // local var--

        System.out.println(i);

        local_global_var obj = new local_global_var();

        System.out.println(obj.name);
        System.out.println(obj.age);

    }

    public void sum() {
        // int i = 20; // local var for sum method
        // int j = 22;
        // int age = 36;

    }
}
