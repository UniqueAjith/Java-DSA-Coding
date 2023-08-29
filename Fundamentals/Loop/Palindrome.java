package com.programs.conditional;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string value: ");
        String word = input.next();
        int len = word.length();
        String res = "";
        while (len > 0){
            res = res + word.charAt(len-1);
            len--;
        }
        if (word.equals(res)){
            System.out.println(word + " is Palindrome");
        }
        else{
            System.out.println(word + " is not Palindrome");
        }

    }
}
