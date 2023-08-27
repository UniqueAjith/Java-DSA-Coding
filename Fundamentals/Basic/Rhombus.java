// Area and Perimeter of Rhombus

package com.programs.basics;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st diagonal value: ");
        int p = input.nextInt();
        System.out.print("Enter 2nd diagonal value: ");
        int q = input.nextInt();
        System.out.print("Enter side value: ");
        int a = input.nextInt();
        int area = (p * q) / 2;
        int perimeter = 4 * a;
        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);
    }
}
