import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int i;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\tSECOND LARGEST NUMBER");
        System.out.println("\nEnter Array Size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Array Elements : ");
        for(i = 0 ; i < arr.length ; i++){

            arr[i] = sc.nextInt();
        }

        int largest =Integer.MIN_VALUE;
        int Secondlargest = Integer.MIN_VALUE;
        for(i = 0 ; i < arr.length ; i++){

            if(arr[i] > largest) {
                Secondlargest = largest;
                largest = arr[i];

            }
            else if( arr[i] < largest && arr[i] > Secondlargest) {
                Secondlargest = arr[i];
            }

        }

        System.out.println("Largest Element : " + largest);


            System.out.println("Second Largest Element : " + Secondlargest);

        }

}