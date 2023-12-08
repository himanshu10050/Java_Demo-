package com.qaautomation.Learn_java;

/**
 * char_to_string
 */
public class char_to_string {

    public static void main(String[] args) {
 // 1.  Using concatenation of strings
        char c = 'A';
        String s = " " + c;
        System.out.println("Chanr to String using concatentation " +  s) ;


// 2. Using the toString() method of the Character class 
        char b = 'G';
        String n = Character.toString(b);
         System.out.println("Chanr to String using toString() method " +  n) ;


    }
}