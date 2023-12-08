
package com.qaautomation.Learn_java;

public class Stringsplit{
    public static void main(String [] arg){
// The split() method divides the string at the specified regex and returns an array of substrings.

        String text= "Hello My name is Himanshu Bisht";
        
        String[] result= text.split(" ");
        System.out.println("result =  " );
        for(String str : result){
            System.out.println(str );
        }


    }
    
} 

