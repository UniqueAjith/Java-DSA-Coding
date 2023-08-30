package com.programs.conditional;

import java.util.Scanner;

public class ReverseString {
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
        System.out.println("Reverse String :" + res);
    }
}
