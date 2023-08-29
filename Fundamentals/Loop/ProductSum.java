// Subtract the Product and Sum of Digits of an Integer

package com.programs.conditional;

import java.util.Scanner;

public class ProductSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int prod = 1, sum = 0;
        while(n != 0){
            int rem = n % 10;
            sum += rem;
            prod *= rem;
            n /= 10;
        }
        int out = prod - sum;
        System.out.println("Output is " + out);
    }
}
