import java.util.Scanner;
public class Maximum_Increase {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];


        for(int i = 0 ; i < arr.length ; i++){

            arr[i] = sc.nextInt();
        }
        int max = 1;
        int current = 1;
        for(int i = 1 ; i < arr.length ; i++){

            if(arr[i] > arr[i-1]){
                current++;
            }
            else{

                current = 1;
            }
            max = Math.max(current,max);

        }
        System.out.println(max);
    }
}
