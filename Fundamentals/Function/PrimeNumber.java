package com.programs.functions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter lower bound: ");
        int start = input.nextInt();
        System.out.print("Enter upper bound: ");
        int end = input.nextInt();
        isPrime(start,end);
    }
    static void isPrime(int a, int b){
        for (int i = a; i <= b;i++){
            if (i == 1 || i == 0){
                continue;
            }
            int prime = 1;
            int j = 2;
            while (j <= i / 2) {
                if (i % j == 0) {
                    prime = 0;
                    break;
                }
                ++j;
            }
            if (prime == 1){
                System.out.print(i + " ");
            }
        }
    }
}
