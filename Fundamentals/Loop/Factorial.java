// Factorial Program

package com.programs.conditional;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int mul = 1;
        if (n == 1 || n == 0){
            System.out.println("The factorial of" + n + " is 1");
        }
        else{
            while(n != 0){
                mul *= n;
                n -= 1;
            }
            System.out.println("The factorial of" + n + " is " + mul);
        }
    }
}
