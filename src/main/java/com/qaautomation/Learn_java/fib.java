package com.qaautomation.Learn_java;

public class fib {
    public static void main(String[] args) {
        int n =10, first=0, second =1;
        System.out.println("Fibonacci Series "+  n + " tems"  ); 

//  Example: Display Fibonacci Series Using for Loop
        
        // for (int i = 1; i <=n; i++) {
        //     System.out.print(first + ", ");

        //      int next= first + second;
        //      first = second;
        //      second = next;
    // }

// Example 2: Display Fibonacci series using while loop
    int i=1;
            while (i<= n) {
                System.out.print(first + " ,");

                int next = first + second;
                first = second;
                second = next;
                i++;
            }

    }
}
