import java.util.Scanner;
public class In_Search_of_an_Easy_Problem {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int hard_count = 0;

        for(int i = 0 ; i < n ; i++){


            int op = sc.nextInt();


            if(op == 1) {
                hard_count++;
            }
        }

            if(hard_count > 0){
                System.out.println("HARD");
            }
            else{
                System.out.println("EASY");
            }
    }
}
