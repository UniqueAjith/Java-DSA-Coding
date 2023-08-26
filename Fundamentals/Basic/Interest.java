// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest

package com.programs.basics;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of Principal: ");
        int P = input.nextInt();
        System.out.print("Enter the value of Time: ");
        int T = input.nextInt();
        System.out.print("Enter the value of Rate: ");
        int R = input.nextInt();
        int interest = (P * R * T) / 100;
        System.out.println("Simple Interest is " + interest);
    }
}
