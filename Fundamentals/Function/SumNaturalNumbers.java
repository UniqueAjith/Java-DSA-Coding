package com.programs.functions;

import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        findSumNaturalNumbers(num);
    }
    static void findSumNaturalNumbers(int n){
        int ans = 0,temp = n;
        while(n > 0){
            ans += n;
            n--;
        }
        System.out.printf("Sum of first %d natural number is %d", temp,ans);
    }
}
