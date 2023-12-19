package com.qaautomation.Pattern_Program;

public class palindromic_number_pyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
// int n = 5;
// for(int i=1; i<=n; i++) {
// //spaces
// for(int j=1; j<=n-i; j++) {
// System.out.print(" ");
// }

// //first part
// for(int j=i; j>=1; j--) {
// System.out.print(j);
// }

// //second part
// for(int j=2; j<=i; j++) {
// System.out.print(j);
// }
// System.out.println();
// }
// }
// }
