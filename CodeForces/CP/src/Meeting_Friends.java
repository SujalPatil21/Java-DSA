import java.util.Scanner;
public class Meeting_Friends {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int a_d = Math.abs(a - b) + Math.abs(a - c);
        int b_d = Math.abs(b - a) + Math.abs(b - c);
        int c_d = Math.abs(c - a) + Math.abs(c - b);

        int min = Math.min(a_d,b_d);
        int final_min = Math.min(c_d,min);

        System.out.println(final_min);

    }


}
