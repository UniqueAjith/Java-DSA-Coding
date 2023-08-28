// Write a program to print whether a number is even or odd, also take input from the user

package com.programs.conditional;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        if (num % 2 == 0){
            System.out.println(num + " is an Even number");
        }
        else{
            System.out.println(num + " is an Odd number");
        }
    }
}