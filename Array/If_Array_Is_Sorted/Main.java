
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\tCHECK IF THE ARRAY IS SORTED");
        System.out.println("\nEnter Array Size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int i ;

        System.out.println("Enter Array Element :  ");
        for(i = 0 ; i < arr.length ; i++){

            arr[i] = sc.nextInt();
        }

        boolean isSorted = true ;
        for(i = 0 ; i < arr.length -1 ; i++){

            if(arr[i] > arr[i+1]) {

                isSorted = false;
                break;
            }
        }
        if(isSorted == true){

            System.out.println("Array Is Sorted..");
        }
        else{

            System.out.println("Array Is Not Sorted..");
        }
    }
}