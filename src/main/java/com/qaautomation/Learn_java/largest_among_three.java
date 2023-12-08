package com.qaautomation.Learn_java;

public class largest_among_three {
    public static void main(String[] args) {

//Example 1: Find Largest Among three numbers using if..else statement  
        double n1=6.4, n2=15.3, n3 =8.5;
        // if (n1>= n2  && n1>=n3) {
        //     System.out.println(n1 + "  is the largest number");
            
        // } else if (n2>=n1 && n2>= n3) {
        //     System.out.println(n2 +  " is the largest number");
            
        // } else {
        //     System.out.println(n3 + " is the largest number");
        // }

//Example 2: Find the largest number among three using nested if..else statement            
        
            if (n1>=n2) {
                
                if (n1>=n3) {
                    System.out.println(n1 + " is the largest number");
                } else {
                    System.out.println(n3 + " is the largest number");
                }
            } else {

                if (n2>= n3) {
                    System.out.println(n2 + " is the largest number");
                    
                } else {
                     System.out.println(n3 + " is the largest number");

                }
                
            }
    }
}
