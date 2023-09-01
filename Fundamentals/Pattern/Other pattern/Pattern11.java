import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(char ch = 'A'; ch<='A'+i;ch++){
                System.out.print(ch + " ");

            }
            System.out.println();

        }
    }
}
