// Area and Perimeter of Rectangle

package com.programs.basics;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length value: ");
        int length = input.nextInt();
        System.out.print("Enter width value: ");
        int width = input.nextInt();
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);
    }
}
