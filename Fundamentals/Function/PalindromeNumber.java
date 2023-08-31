// Write a function to find if a number is a palindrome or not. Take number as parameter.

package com.programs.functions;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int ans = isPalindrome(num);
        if (num == ans){
            System.out.println(num + " is Palindrome");
        }
        else{
            System.out.println(num + " is not Palindrome");
        }
    }
    static int isPalindrome(int n){
        int num = 0;
        while (n > 0){
            int rem = n % 10;
            num = (num * 10) + rem;
            n /= 10;
        }
        return num;
    }
}
