package com.programs.conditional;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        boolean prime = false;
        if (n > 1){
            for (int i = 2; i < n;i++){
                if (n % i == 0){
                    prime = true;
                    break;
                }
            }
            if (prime){
                System.out.println(n + " is not a prime number");
            }
            else{
                System.out.println(n + " is a prime number");
            }
        }
        else{
            System.out.println(n + " is less than or equal to 1, so it's not prime number");
        }
    }
}
