package com.qaautomation.Loops;
// import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {

         
// Example 1: Check whether a number is even or odd using if...else statement
        // Scanner red = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int num = red.nextInt();
        // if(num%2 == 0){
        //     System.out.println(num + " is even");
            
        // }
        // else{
        //     System.out.println(num + "  is odd");
        // }



//Example 2: Check whether a number is even or odd using ternary operator
        // Scanner red = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int num = red.nextInt();
        // String evenOdd = (num % 2 == 0) ? "even" : "odd";

        // System.out.println(num + " is " + evenOdd);


// Example 3: check wheather year is leap or not using if...else statement
        // Scanner red = new Scanner(System.in);
        // System.out.println("Enter a year");
        // int num = red.nextInt();
        // if(num%4 == 0){
        //     System.out.println(num + " is leap year");
            
        // }
        // else{
        //     System.out.println(num + "  is not a leap year");
        // }


//Example 4: check wheather year is leap or not using ternary operator?
        // Scanner red = new Scanner(System.in);
        // System.out.println("Enter a year");
        // int num = red.nextInt();
        // String leap = (num % 4 == 0) ? "leap year" : " not a leap year";

        // System.out.println(num + " is " + leap);


//Example 5: check wheather a number is positive or negative using if  else statement
    // Scanner red = new Scanner(System.in);
    //     System.out.println("Enter a number");
    //     int num = red.nextInt();
    //     if(num< 0.0){
    //         System.out.println(num + " number is negative");
            
    //     }
    //     else if(num> 0.0){
    //         System.out.println(num + " number is postive ");
    //     }
    //     else{
    //         System.out.println("number is 0");
    //     }


//Example 6: check wheather a number is positive or negative using ternary operator?
        // Scanner red = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int num = red.nextInt();
        // String number = (num  < 0.0) ? "negative number" : " postive number";

        // System.out.println(num + " is " + number);


//Example 7: check wheather a character is alphabets using if else statement
        // char c = '*';
        // if(c > 'a' && c < 'z'|| c > 'A' && c<'Z'){
        //     System.out.println( " character is alphabets");
        // }
        // else {
        //     System.out.println(" character is not a alphabets");
        // }
        
        

//Example 8: check wheather a character  is alphabets using ternary operator?
        //  char c = '*';

        // String number = (c> 'a' && c< 'z')  || (c> 'A' && c< 'Z') ? "alphabets " : " is not a alphabets";

        // System.out.println(c + " is " + number);


// //Example 9: check wheather a character  is alphabets using  isAlphabetic() Method
        //     char c = 't';
        //     if(Character.isAlphabetic(c)){
        //         System.out.println(c + " is a alphabet");
        //     }
        //     else{
        //         System.out.println(c + " is not a alphabet");
        //     }

// // Example 10: Find GCD of two numbers using for loop and if statement
                // int n1 = 81, n2 = 153;
                // int gc =1;
//                 for (int i = 1; i <= n1 && i<= n2; i++) {
//                         if(n1%i == 0 && n2%i ==0){
//                                  gc=i;
//                         }
                               
//                 }       
//                         System.out.println(gc);

 
// // Example 11: Find GCD of two numbers using for loop and if statement

                
        //  int n1 = 15, n2 = 25;
        //         int gc =1;

        //         while(n1 != n2) {
    
        //                   if(n1 > n2) {
        //                   n1 -= n2;
        //                 }
                        
        //                 else {
        //                   n2 -= n1;
        //                 }
        //               }
                  
        //               System.out.println("GCD: " + n1);


// Example 1: LCM using while Loop and if Statement
                // int n1 = 72, n2 =120, lcm;
                // lcm= (n1>n2)? n1:n2;
                // // System.out.println(lcm);
                // while (true) {
                //         if(lcm%n1 == 0 && lcm%n2 ==0){
                //                 System.out.println(lcm);
                //                 break;
                //         }
                //         lcm++;
                // }


// Example 2: Calculate LCM using GCD
//            int n1 = 72, n2 = 120, gcd = 1;

//     for(int i = 1; i <= n1 && i <= n2; ++i) {
//       // Checks if i is factor of both integers
//       if(n1 % i == 0 && n2 % i == 0)
//         gcd = i;
//     }

//     int lcm = (n1 * n2) / gcd;
//     System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);



  }
}

