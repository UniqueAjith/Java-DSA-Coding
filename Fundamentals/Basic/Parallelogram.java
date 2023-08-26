// Area and Perimeter of Parallelogram

package com.programs.basics;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base value: ");
        int base = input.nextInt();
        System.out.print("Enter side value: ");
        int side = input.nextInt();
        System.out.print("Enter height value: ");
        int height = input.nextInt();
        int area = base * height;
        int perimeter = 2 * (base + side);
        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);
    }
}
