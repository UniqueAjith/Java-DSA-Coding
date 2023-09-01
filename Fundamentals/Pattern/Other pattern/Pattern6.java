import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int start = 1;
        for(int row=1; row<=n; row++){
            if(row%2 == 0) {
                start = 0;
            }else{
                start = 1;
            }
            for(int col=1; col<=row; col++){
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }

    }
}
