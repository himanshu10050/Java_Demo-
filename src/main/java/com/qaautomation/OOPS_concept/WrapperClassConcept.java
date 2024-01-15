package com.qaautomation.OOPS_concept;

public class WrapperClassConcept {

    public static void main(String[] args) {
        String x = "100";
        System.out.println(x + 20);

        // Data convesation : string to int
        int i = Integer.parseInt(x);
        System.out.println(i + 20);

        // String to double
        String y = "12.44";
        double d = Double.parseDouble(y);
        System.out.println(d + 32.55);

        // String to bollean
        String z = "true";
        boolean b = Boolean.parseBoolean(z);
        System.out.println(b);

        // Int to String conversation
        int n = 200;
        System.out.println(n + 40);
        String s = String.valueOf(n);
        System.out.println(s + 30);
    }
}
