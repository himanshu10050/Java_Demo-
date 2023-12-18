package com.qaautomation.OOPS_concept;

public class car {
    // global and class varibales

    int mod;
    int wheeL;

    public static void main(String[] args) {
        // new car(); ------ this is the object of car class
        // new keyword is used to create the object
        // a,b,c--------------- Object refrerence variables
        car a = new car();
        car b = new car();
        car c = new car();

        a.mod = 2014;
        a.wheeL = 4;

        b.mod = 2016;
        b.wheeL = 4;

        c.mod = 2018;
        c.wheeL = 4;

        System.out.println(a.mod);
        System.out.println(a.wheeL);

        System.out.println(b.mod);
        System.out.println(b.wheeL);

        System.out.println(c.mod);
        System.out.println(c.wheeL);
    }
}
