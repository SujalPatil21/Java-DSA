
import java.util.Scanner;

public class Bit {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0 ;

        for (int i = 0; i < n; i++) {

            String s = sc.next();

            if (s.contains("+")) {
                x++;
            } else {
                x--;
            }

        }
        System.out.println(x);
    }
}
