import java.util.Scanner;

class Array{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[5];
      //input
      for(int i=0; i<arr.length; i++){
          arr[i] = sc.nextInt();
      }
      //output
      for(int num:arr){
          System.out.print(num + " ");
      }
    }
}