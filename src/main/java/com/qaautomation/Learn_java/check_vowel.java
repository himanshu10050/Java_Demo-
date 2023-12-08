package com.qaautomation.Learn_java;

public class check_vowel {
 public static void main(String[] args) {
//Example 1: Check whether an alphabet is vowel or consonant using if..else statement
    // char ab ='f';

    // if(ab== 'a' || ab== 'e'  || ab== 'i' || ab== 'o' || ab== 'u'){
    //     System.out.println(ab + "is vowel ");
    // }
    // else{
    //     System.out.println(ab + " is constant");
    // }

// Example 2: Check whether an alphabet is vowel or consonant using switch statement
        char ch = 'T';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
        
            default:
            System.out.println(ch + " is constant");
                break;
        }

 }   
}
