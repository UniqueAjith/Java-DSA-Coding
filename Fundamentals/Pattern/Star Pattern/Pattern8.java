import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
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
