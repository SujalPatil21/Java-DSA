import java.util.Scanner;
public class Lucky_Number {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long count = 0;
        while(n > 0){

            long digit = n % 10;
            if(digit == 4 || digit == 7){
                count++;
            }
            n = n / 10 ;
        }

        if(count == 4 || count == 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
