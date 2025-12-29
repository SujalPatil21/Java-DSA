    import java.util.Scanner;

    public class Main{

        public static void main(String[] args){


            Scanner sc = new Scanner(System.in);

            System.out.println("\n\tNUMBER OF ODD AND EVEN NUMBERS");

            System.out.println("\nEnter Size Of Array : ");
            int n = sc.nextInt();

            int[] arr = new int[n]; // Dyanmic Memory Allocation

            System.out.println("Enter Elements : ");
            for(int i = 0 ; i < arr.length ; i++){

                arr[i] = sc.nextInt();

            }
            int evencount = 0;
            int oddcount =0;
            for(int i = 0 ; i < arr.length ; i++){


                int element = arr[i];

                if(element % 2 == 0 ){

                    evencount++;
                }
                else{

                    oddcount++;
                }
            }
            System.out.println("Number Of Odd Numbers : " + oddcount);
            System.out.println("Number Of Even Numbers : " + evencount);
    
            }
        }
