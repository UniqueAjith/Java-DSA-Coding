import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        pyramid(n);
        invertedPyramid(n);
    }
    static void pyramid(int n) {
        for (int row=1; row<=n; row++){
            int noOfSpace =n-row;
            for(int space = 1; space<=noOfSpace;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=2*row-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void invertedPyramid(int n) {
        for (int row=1; row<=n; row++){
            for(int space = 1; space<row;space++){
                System.out.print(" ");
            }
            int element = 2*n - (2*row - 1);
            for(int col=1;col<=element;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
