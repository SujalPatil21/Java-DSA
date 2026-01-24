class Main{

    public static void main(String[] args){

        int negative_number_count = 0;
        int[] arr = {2, -6, 4, 8, 1, -9};

        for (int i = 0 ; i < arr.length ; i++){

            if(arr[i] < 0 ){

                negative_number_count++;

            }
        }
        System.out.println("\nNumber of Negative numbers : " + negative_number_count);
    }
}