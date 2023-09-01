import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int n = 2 * num - 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                int atEveryIndex = num - Math.min(Math.min(row-1, col-1), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
