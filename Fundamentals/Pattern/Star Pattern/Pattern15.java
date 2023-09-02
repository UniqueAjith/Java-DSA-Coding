import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int row = n; row >= 1; row--) {
            for (int space = row; space < n; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= (2 * row - 1); col++) {
                if (col == 1 || row == n || col == (2 * row - 1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
