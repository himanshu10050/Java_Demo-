package com.qaautomation.array;

import java.util.Arrays;

import org.openqa.selenium.devtools.v114.systeminfo.SystemInfo;

/**
 * Innerarray1
 */

public class array_example {
    public static void main(String[] args) {

        // one dim array

        // 1. Interger array
        int i[] = new int[5];
        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;
        i[4] = 50;
        // System.out.println(i[3]);
        // System.out.println(i[5]); // ArrayIndexOutOfBoundsException

        // to get length of the values
        // System.out.println(i.length);

        // To print all the array value use for loop
        // for (int j = 0; j < i.length; j++) {
        // System.out.println(i[j]);

        // }

        // for (int k : i) {
        // System.out.println(k);
        // }
        // int[] age = { 2, 5, 3, 7, 2 };
        // // double[] age;

        // for (int i = 0; i <= age.length; i++) {

        // System.out.println(age[i]);

        // }

        // 2. String Array
        String s[] = new String[3];
        s[0] = "String 1";
        s[1] = "String 2";
        s[2] = "string 3";
        // System.out.println(s[0]);

        // 3. Char Array
        char c[] = new char[3];
        c[0] = 'A';
        c[1] = 'B';
        c[2] = 'C';

        // System.out.println(c[2]);

        // 4. Double array
        double d[] = new double[3];
        d[0] = 21.33d;
        d[1] = 432.22;
        d[2] = 4322.23;
        // System.out.println(d[1]);

        // 5. boolean array
        boolean b[] = new boolean[2];
        b[0] = true;
        b[1] = false;

        // System.out.println(b[1]);

        // 6. object array // is used to store different values
        Object o[] = new Object[4];
        o[0] = "himanshu";
        o[1] = 23;
        o[2] = 234.32;
        o[3] = true;

        // System.out.println(o[2]);

        // Two dim
        // array---------------------------------------------------------------------------------------------

        // 1. Interger array

        int a[][] = new int[3][5];

        // System.out.println(a.length);
        // System.out.println(a[0].length);
        a[0][0] = 23;
        a[0][1] = 24;
        a[0][2] = 26;
        a[0][3] = 27;
        a[0][4] = 29;

        a[1][0] = 31;
        a[1][1] = 35;
        a[1][2] = 32;
        a[1][3] = 36;
        a[1][4] = 38;

        a[2][0] = 43;
        a[2][1] = 44;
        a[2][2] = 46;
        a[2][3] = 47;
        a[2][4] = 49;

        // System.out.println(a[2][2]);

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[0].length; col++) {
                // System.out.println(a[row][col]);
            }
        }
        System.out.println("--------------------------------------------------------");
        for (int[] row : a) {
            for (int col : row) {
                // System.out.println(col);
            }
        }

        // ------------------------------------------------------------------------------------------------------------------------
        // Print an Array using standard library Arrays
        int n[] = { 12, 43, 32, 42, 55 };
        for (int num : n) {
            // System.out.println(num);
        }

        // System.out.println(Arrays.toString(n));

        int[][] array = { { 1, 2 }, { 3, 4 }, { 5, 6, 7 } };
        // System.out.println(Arrays.deepToString(array));

        // ------------------------------------------------------------------------------------------------------------------------
        // Concatenate Two Arrays using arraycopy
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 4, 5, 6 };

        // int arr1 = array1.length;
        // int arr2 = array2.length;

        // int[] result = new int[arr1 + arr2];
        // System.arraycopy(array1, 0, result, 0, arr1);
        // System.arraycopy(array2, 0, result, arr1, arr2);

        // System.out.println(Arrays.toString(result));

        // -------------------------------------------------------------------------------------------------------------------------------
        // Concatenate Two Arrays without using arraycopy

        int length = array1.length + array2.length;
        int[] new_result = new int[length];
        int pos = 0;
        for (int element : array1) {
            new_result[pos] = element;
            pos++;
        }

        for (int element : array2) {
            new_result[pos] = element;
            pos++;
        }
        System.out.println(Arrays.toString(new_result));
    }
}
