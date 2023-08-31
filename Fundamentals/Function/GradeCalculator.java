/* Program to find the grade of a student, given the marks of N subjects. Given the marks of N subjects,
we have to print the grade of a student based on the following grade slab.
If Percentage Marks > 90, Grade is A+
If 70 <= Percentage Marks <= 89, Grade is A
If 60 <= Percentage Marks <= 69, Grade is B
If 50 <= Percentage Marks <= 59, Grade is C
If Percentage Marks <= 49, Grade is D
percentage = (totalMarks/(count*100)) * 100;
*/

package com.programs.functions;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. of Subjects: ");
        int n = input.nextInt();
        int total = 0;
        for(int i=1; i <= n; i++){
            System.out.printf("Enter %d subject in row: ",i);
            int num = input.nextInt();
            total += num;
        }
        System.out.println("Total marks is " + total);
        grade(total,n);
    }
    static void grade(int total, int sub){
        float percentage =(float) (total/sub);
        System.out.println("Percentage is " + percentage);
        switch ((int)percentage/10){
            case 9 -> System.out.println("Grade is A+");
            case 8, 7 -> System.out.println("Grade is A");
            case 6 -> System.out.println("Grade is B");
            case 5 -> System.out.println("Grade is C");
            default -> System.out.println("Grade is D");
        }
    }
}
