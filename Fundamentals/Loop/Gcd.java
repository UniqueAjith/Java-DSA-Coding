package com.programs.conditional;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();
        int smaller;
        int gcd = 0;
        if (num1 > num2){
            smaller = num2;
        }
        else{
            smaller = num1;
        }
        for (int i = 1; i <= smaller;i++){
            if (num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + gcd);
    }
}
