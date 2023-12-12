package com.qaautomation.If_Else_Loops;

public class check_pelidrome {
    public static void main(String[] args) {

        // Example 1: Java Program to Check Palindrome String
        // String str = "Radar", reverseStr = "";
        // int strlength = str.length();

        // for (int i = (strlength -1); i>=0; i--) {

        // reverseStr= reverseStr + str.charAt(i);
        // }
        // if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
        // System.out.println(str + " this is palidrome string");

        // }
        // else{
        // System.out.println(str + " this is not a palidrome string");
        // }

        // Example 2: Java Program to Check Palindrome Number
        int num = 4114, reserve = 0;

        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reserve = reserve * 10 + digit;

        }
        int originalNum = reserve;
        System.out.println(originalNum);
        if (originalNum == num) {
            System.out.println("it is  a palidrome no.");
        } else {
            System.out.println("it is  not a palidrome no");
        }
    }
}
