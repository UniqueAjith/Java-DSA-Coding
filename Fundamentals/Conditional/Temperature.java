// To convert temperatures to and from Celsius, Fahrenheit

package com.programs.conditional;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        float temp = input.nextFloat();
        System.out.print("Enter C or F: ");
        char unit = input.next().trim().charAt(0);
        double newTemp;
        if (unit == 'f'){
            newTemp = (1.8 * temp) + 32;
            System.out.print("Temperature in F is " + newTemp);
        } else if (unit == 'c') {
            newTemp = (temp - 32) * 0.555556;
            System.out.print("Temperature in C is " + newTemp);
        }
        else {
            System.out.print("Invalid unit");
        }
    }
}
