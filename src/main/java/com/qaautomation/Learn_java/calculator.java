package com.qaautomation.Learn_java;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        char operator;
        Double num1, num2, result;

        try (Scanner op = new Scanner(System.in)) {
            System.out.println("Enter Operator + - * / % ");

            operator = op.next().charAt(0);

            System.out.println("enter first number");
            num1 = op.nextDouble();

            System.out.println("enter second number");
            num2 = op.nextDouble();
        }

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(result + " this is the Sum of " + num1 + " and " + num2);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(result + " this is the Subtraction  of " + num1 + " and " + num2);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(result + " this is the Multiplication of " + num1 + " and " + num2);
                break;

            case '/':
                result = num1 / num2;
                System.out.println(result + " this is the Division  of " + num1 + " and " + num2);
                break;

            case '%':
                result = num1 % num2;
                System.out.println(result + " this is the Modeulation  of " + num1 + " and " + num2);
                break;

            default:
                System.out.println("this is invalid operator");
                break;
        }
    }
}
