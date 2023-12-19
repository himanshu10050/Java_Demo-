package com.qaautomation.Pattern_Program;

//     *****
//    ***** 
//   *****  
//  *****   
// *****
public class solid_rhombus {
    public static void main(String[] args) {

        int n = 5;
        int m = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (int k = 5; k >= m; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
