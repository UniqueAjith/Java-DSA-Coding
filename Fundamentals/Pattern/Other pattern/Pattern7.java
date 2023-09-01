import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int row=1; row<=n; row++){
            int noOfSpace = n - row;
            for(int space=1; space<=noOfSpace;space++){
                System.out.print("  ");
            }
            for (int col = row; col >= 1 ; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
