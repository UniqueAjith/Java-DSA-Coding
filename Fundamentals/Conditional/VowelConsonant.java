package com.programs.conditional;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch = input.next().trim().charAt(0);
        switch (ch){
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println(ch + " is Vowel");
            default -> System.out.println(ch + " is Consonant");
        }

    }
}
