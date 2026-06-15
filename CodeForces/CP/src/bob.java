
import java.util.Scanner;
public class bob {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //limak
        int b = sc.nextInt(); //bob
        int year = 0;

        while (a <= b) {

            a = a * 3;
            b = b * 2;
            year++;
        }
        System.out.println(year);
    }
}
