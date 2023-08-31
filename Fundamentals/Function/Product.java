// Define a method that returns the product of two numbers entered by user.

package com.programs.functions;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        prod(num1,num2);
    }
    static void prod(int a, int b){
        System.out.printf("Multiplication of %d and %d is %d",a,b,a*b);
    }
}
