import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        inverted(n);
        normal(n);
    }
    static void inverted(int n) {
        for(int row=1; row<=n; row++){
            for(int space=1; space<row;space++){
                System.out.print(" ");
            }
            for(int col=1; col<=n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void normal(int n) {
        for(int row=1; row<=n; row++){
            int noOfSpace = n - row;
            for(int space=1; space<=noOfSpace;space++){
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
