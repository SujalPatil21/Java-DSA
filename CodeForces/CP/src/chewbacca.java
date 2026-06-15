    import java.util.Scanner;

    public class chewbacca {

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            String s = sc.next();
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {

                int d = s.charAt(i) - '0';
               if( i == 0 && d == 9){
                   ans.append(9);
               }
               else {
                   ans.append(Math.min(d, 9 - d));
               }
            }
            System.out.println(ans);
        }
    }