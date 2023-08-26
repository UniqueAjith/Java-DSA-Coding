// Input currency in rupees and output in USD.

package com.programs.basics;

import java.util.Scanner;

public class CurrencyChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of Indian currency: ");
        int currency = input.nextInt();
        int dollar = (int)(currency / 81.83);
        System.out.println("Indian Rupees of " + currency + " is converted to " + dollar + "$");
    }
}
