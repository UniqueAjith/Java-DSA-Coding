// Volume of Cone

package com.programs.basics;

import java.util.Scanner;

public class Cone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius value: ");
        int radius = input.nextInt();
        System.out.print("Enter height value: ");
        int height = input.nextInt();
        float volume = (float) (3.14 * (radius * radius) * height / 3);
        System.out.println("Volume is " + volume);
    }
}
