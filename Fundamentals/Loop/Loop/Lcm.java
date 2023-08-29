package com.programs.conditional;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();
        int greater, lcm;
        if (num1 > num2){
            greater = num1;
        }
        else{
            greater = num2;
        }
        while (true){
            if (greater % num1 == 0 && greater % num2 == 0){
                lcm = greater;
                break;
            }
            greater++;
        }
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
    }
}
