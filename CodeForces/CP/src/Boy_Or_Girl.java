import java.util.*;
public class Boy_Or_Girl {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        HashSet<Character> set = new HashSet<>();

        for(int i = 0 ; i < s.length() ; i++){

            set.add(s.charAt(i));
        }
        int size = set.size();

        if(size % 2 == 0 ){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}
