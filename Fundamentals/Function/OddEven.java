// Define a program to find out whether a given number is even or odd

package com.programs.functions;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        EvenODD(num);
    }
    static void EvenODD(int a){
        if (a % 2 == 0){
            System.out.println(a + " is an Even number");
        }
        else{
            System.out.println(a + " is an Odd number");
        }
    }
}
