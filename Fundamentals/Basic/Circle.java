// Area and Perimeter of Circle

package com.programs.basics;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius value: ");
        int radius = input.nextInt();
        double area = 3.14 * radius * radius;
        double perimeter = 2 * 3.14 * radius;
        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);
    }
}
