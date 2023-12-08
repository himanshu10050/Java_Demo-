package com.qaautomation.Loops;

// import java.math.BigInteger;

public class first_program {
  public static void main(String[] args) {

//// Exapmle 1: Simple for loop to print nth times
    // int n = 5;
    // // for loop  
    // for (int i = 1; i <= n; ++i) {
    //   System.out.println("Java is fun");
    // }

//// Example 2: Sum of Natural Numbers using for loop
    // int num = 100, sum = 0;

    // for (int i = 1; i <=num; i++) {
    //   sum = sum + i;
    // }
    //   System.out.println(sum);


  //// Example 3: Sum of Natural Numbers using while loop
      // int num =100, i=1, sum =0;
      // while (i<=num) {
      //   sum= sum +i;
      //   i++;
      // }
      // System.out.println(sum);

// // Example 4: Find Factorial of a number using for loop
//         int num =10;
//         long fact = 1;
//         for (int i = 1; i <=num; i++) {
//          fact *= i;
//         }
//         System.out.println(fact);


// //Example 5: Find Factorial of a number using while loop
//   int num =10, i=1;
//   long fact=1;
//   while (i<=num) {
//     fact *= i;
//     i++;
//   }
//   System.out.println(fact);


// // Example 6: Find Factorial of a number using BigInteger
//     int num =30;
//     BigInteger fact= BigInteger.ONE;
//     for (int i = 1; i <= num; i++) {
//       fact = fact.multiply(BigInteger.valueOf(i));
//     }
//     System.out.printf("Factorial of " + num + " is  " +  fact);


// Example 7: Generate Multiplication Table using for loop

      // int num =17;
      // for (int i = 1; i <=10; i++) {
        
      //   System.out.printf("%d * %d  = %d\n", num , i , num*i);
      // }


// Example 8: Display uppercased alphabet using for loop
        // char C;
        // for (C ='A'; C<='Z'; C++) {
        //   System.out.println(C);
        // }


// Example 9: Count Number of Digits in an Integer using while loop
          // int count =0, num= 005034;
          // while (num!=0) {
          //   num/=10;
          //   ++count;
          // }
          // System.out.println(count);  
          

// Example 10: Count Number of Digits in an Integer using for loop
          // int count =0, num =100;
          // for (; num!= 0; num/=10, count++) {
            
          // }
          // System.out.println(count);


// Example 11: Reverse a Number using a while loop in Java
            // int num= 3242, reserve=0;
            // while (num!=0) {
            //   int digit =num%10;
            //   reserve=  reserve* 10 + digit;
            //   num/= 10; 
            // }
            // System.out.println(reserve);

// Example 12: Reverse a number using a for loop in Java
              // int num =34432, reserve=0;
              // for (; num!=0; num/=10){
              //   int digit =num%10;
              //   reserve = reserve * 10 +digit;

              // }
              // System.out.println(reserve);


  // Example 13: Calculate power of a number using a while loop
                // int base=2, exponent=5;
                // long result=1;
                // while (exponent!=0) {
                //   result*=base;
                //   exponent--;
                  
                // }
                // System.out.println(result);



// Example 14: Calculate the power of a number using a for loop
                  int base = 3, exponent= 3;
                  long result =1;
                  for (;exponent!=0; exponent--) {
                    result*=base;
                    
                  }
                  System.out.println(result);

  }
}