import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int start = 1;
        for (int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++){
                System.out.print(start + " ");
                start = start + 1;
            }
            System.out.println();
        }
    }
}
