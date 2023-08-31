// Write a program to print the sum of two numbers entered by user by defining your own method

package com.programs.functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        sum(num1,num2);
    }
    static void sum(int a, int b){
        System.out.printf("Addition of %d and %d is %d",a,b,a+b);
    }
}
