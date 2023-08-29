// Armstrong Number

package com.programs.conditional;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number from 100 to 999: ");
        int n = input.nextInt();
        int temp = n, res = 0;
        while(temp > 0){
            int rem = temp % 10;
            res += (rem * rem * rem);
            temp /= 10;
        }
        if (res == n){
            System.out.println(n + " is Armstrong number");
        }
        else{
            System.out.println(n +" is not Armstrong number");
        }
    }
}
