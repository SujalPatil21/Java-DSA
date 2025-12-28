import java.sql.SQLOutput;
import java.util.Scanner;

public class Linear {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t  LINEAR SEARCH");

        System.out.println("\nEnter The Size Of The Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Element : ");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Element To Find : ");
        int target = sc.nextInt();

        int result = LinearSearch(arr, target);
        System.out.println("Element Found At Index : " + result);
    }

    static int LinearSearch(int[] arr, int target) {


        if (arr.length == 0) {

            return -1;
        }

        for (int i = 0; i < arr.length; i++) {

            int element = arr[i];
            if (element == target) {

                return i+1;

            }

        }
        return -1;
    }
}