// Area and Perimeter of Equilateral Triangle

package com.programs.basics;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int a = input.nextInt();
        double area = 1.732 / 4 * a * a;
        System.out.println("Area is " + area);
        double perimeter = 3 * a;
        System.out.println("Perimeter is " + perimeter);
    }
}
