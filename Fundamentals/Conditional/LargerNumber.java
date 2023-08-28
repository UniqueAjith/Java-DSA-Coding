package com.programs.conditional;

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = input.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = input.nextInt();
        int large;
        if (a >= b && a >= c){
            large = a;
        }
        else if (b >= a && b >= c){
            large = b;
        }
        else{
            large = c;
        }
        System.out.println("Large Number is " + large);
    }
}
