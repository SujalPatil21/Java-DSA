import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\tBinary Search ");
        System.out.println("\nEnter Array Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int i ;
        System.out.println("Enter Sorted Array : ");
        for(i = 0 ; i < arr.length ; i++){

            arr[i] = sc.nextInt();
        }

        System.out.println("Enter The Element You Want To Search : ");
        int target = sc.nextInt();

        int result = binarySearch(arr,target);
        System.out.println("Element Found At This Index : " + result);


    }
    static int binarySearch(int[] arr , int target) {

        if(target < arr.length-1){

            return -1 ;
        }

        int start = 0;
        int end = arr.length - 1;
        int mid;


        while(start <= end) {
             mid = start + (end - start) / 2;

            if (arr[mid] < target) {

                start = mid + 1;


            } else if (arr[mid] > target) {

                end = mid - 1;
            } else {
                return mid+1;

            }


        }
        return end;
    }


}
