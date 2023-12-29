package com.qaautomation.Pattern_Program;

// 333222111
// 332211   
// 321  
public class new_class {
    public static void main(String[] args) {

        int n = 4;
        for (int i = n; i > 0; i--) {

            for (int j = n; j > 0; j--) {
                System.out.print(" I" + i + "-" + "J" + j);

                // for (int k = 0; k < i; k++) {
                // System.out.print(j);
                // }
            }

            System.out.println();
        }

    }
}