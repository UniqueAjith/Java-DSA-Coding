import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int row=1; row<2*n; row++){
            int element = row>n ? 2*n-row : row;
            for(int col=1;col<=element;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
