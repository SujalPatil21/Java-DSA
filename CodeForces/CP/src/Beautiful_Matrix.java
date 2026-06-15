import java.util.*;

public class Beautiful_Matrix {

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            int[][] matrix = new int[5][5];
            int steps = 0 ;
            for(int i = 0 ; i < matrix.length;i++){

                for(int j = 0 ; j < matrix[0].length;j++){

                    matrix[i][j] = sc.nextInt();
                    if(matrix[i][j] == 1){
                        steps = Math.abs( i - 2 ) + Math.abs( j - 2);
                    }
                }
            }
            System.out.println(steps);

        }
}
