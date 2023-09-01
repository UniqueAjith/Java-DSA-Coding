import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int row = 1; row <= 2 * n; row++) {
            int element = row > n ? 2 * n - row : row;
            int noOfSpace = n - element;
            for(int space = 1; space <= noOfSpace; space++){
                System.out.print(" ");
            }
            for (int col = element; col >= 1 ; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= element ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
