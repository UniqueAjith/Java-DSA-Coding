/* A person is eligible to vote if his/her age is greater than or equal to 18.
Define a method to find out if he/she is eligible to vote*/

package com.programs.functions;

import java.util.Scanner;

public class EligibleVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        boolean res = isEligibleVote(age);
        if (res){
            System.out.println("Your age is " + age + ". You are eligible to vote!");
        }
        else{
            System.out.println("Your age is " + age + ". You are not eligible to vote.");
        }
    }
    static boolean isEligibleVote(int num){
        return num >= 18;
    }
}