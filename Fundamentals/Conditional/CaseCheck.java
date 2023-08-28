// Case Checker

package com.programs.conditional;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String c = input.next().trim();
        char d = c.charAt(0);
        if (d >= 'a' && d <= 'z'){
            System.out.println(c + " is Lowercase");
        }
        else{
            System.out.println(c + " is Uppercase");
        }
    }
}
