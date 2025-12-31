import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        int i,n;

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\tMAX/MIN NUMBER");
        System.out.println("\nEnter The Size Of Array : ");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Elements : ");

        for(i = 0 ; i < arr.length ; i++){

            arr[i] = sc.nextInt();

        }
        int min = arr[0];
        int max = arr[0];

        for(i = 0 ; i < arr.length ; i++){

            if(max < arr[i]){

                max = arr[i];
            }
            if(min > arr[i]){

                min = arr[i];
            }

        }

        System.out.println("Maximum Number : " + max);
        System.out.println("Minimum Number : " + min);
    }
}