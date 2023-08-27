// Area of Triangle

package com.programs.basics;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base value: ");
        int base = input.nextInt();
        System.out.print("Enter height value: ");
        int height = input.nextInt();
        double area = 0.5 * base * height;
        System.out.println("Area is " + area);
    }
}
