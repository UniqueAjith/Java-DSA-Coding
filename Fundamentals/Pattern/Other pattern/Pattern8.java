import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int noOfSpace = 2 * (n-1);
        for(int row = 1; row <= n; row++){
            for(int col=1; col<=row;col++){
                System.out.print(col);
            }
            for(int space = 1; space<=noOfSpace;space++){
                System.out.print(" ");
            }
            for(int col=row; col>=1;col--){
                System.out.print(col);
            }
            noOfSpace = noOfSpace - 2;
            System.out.println();
        }
    }
}
