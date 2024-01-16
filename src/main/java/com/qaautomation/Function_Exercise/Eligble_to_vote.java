package com.qaautomation.Function_Exercise;

import java.util.Scanner;

public class Eligble_to_vote {

    public static void eligible_to_vote(int age) {
        if (age >= 18) {
            System.out.println("Eligble to vote ");
        } else {
            System.out.println("Not eligble to vote");
        }
        return;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter age : ");
            int age = sc.nextInt();

            eligible_to_vote(age);
        }
    }
}
