package com.programs.conditional;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int ans = 0 ,rem;
        while(num > 0){
            rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println("Reverse num :" + ans);
    }
}
