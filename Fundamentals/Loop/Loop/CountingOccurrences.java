// Counting Occurrences in number

package com.programs.conditional;

import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.print("Enter the number to find counting occurrences: ");
        int n = input.nextInt();
        int count = 0 , rem;
        while(num > 0){
            rem = num % 10;
            if(rem == n){
                count++;
            }
            num /= 10;
        }
        System.out.println("The counting occurrences is " + count);
    }
}
