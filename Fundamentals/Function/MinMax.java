// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user

package com.programs.functions;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        System.out.print("Enter Third Number: ");
        int num3 = input.nextInt();
        int min = minimum(num1,num2,num3);
        int max = maximum(num1,num2,num3);
        System.out.printf("Minimum of three numbers %d, %d, and %d is : %d %n", num1, num2, num3, min);
        System.out.printf("Maximum of three numbers %d, %d, and %d is : %d %n", num1, num2, num3, max);
    }
    static int minimum(int a,int b, int c){
        int small;
        if (a <= b && a <= c){
            small = a;
        }
        else if (b <= a && b <= c){
            small = b;
        }
        else{
            small = c;
        }
        return small;
    }
    static int maximum(int a,int b, int c){
        int large;
        if (a >= b && a >= c){
            large = a;
        }
        else if (b >= a && b >= c){
            large = b;
        }
        else{
            large = c;
        }
        return large;
    }
}
