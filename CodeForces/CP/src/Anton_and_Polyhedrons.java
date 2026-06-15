
import java.util.HashMap;
import java.util.Scanner;
public class Anton_and_Polyhedrons {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<String,Integer> map = new HashMap<>();

        map.put("Tetrahedron", 4);
        map.put("Cube", 6);
        map.put("Octahedron", 8);
        map.put("Dodecahedron", 12);
        map.put("Icosahedron", 20);

        int sum = 0 ;


        for(int i = 0 ; i < n ; i++){

            String s = sc.next();

            sum += map.get(s);
        }

        System.out.println(sum);
    }
}
