// Take 2 numbers as input and print the largest number

package com.programs.basics;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the Second number: ");
        int b = input.nextInt();
        if (a > b){
            System.out.println(a + " is larger than " + b);
        }
        else{
            System.out.println(a + " is smaller than " + b);
        }
    }
}
