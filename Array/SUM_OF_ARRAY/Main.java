import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("\n\tSUM OF ARRAY ELEMENTS");
        System.out.println("\nEnter Size Of Array : ");
        n = sc.nextInt();

        int[] arr = new int[n];
        int i ;

        System.out.println("Enter Array Elements : ");
        for(i = 0 ; i < arr.length ; i++){

            arr[i] = sc.nextInt();

        }
        int sum = 0;
        for(i = 0 ; i < arr.length ; i++){

            sum += arr[i];

        }
        System.out.println("Sum Of All Array Elements : " + sum );
    }
}