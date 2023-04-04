/**
 * Input:
    MATRIX = { {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {0, 0, 1, 0} }
    Output: id = 2
    Explanation: The person with ID 2 does not know anyone but everyone knows him

    Input:
    MATRIX = { {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 1, 0, 0}, {0, 0, 1, 0} }
    Output: No celebrity
    Explanation: There is no celebrity.
 */

import java.util.Arrays;

public class CelebrityProblem {
    public static void main(String[] args) {
        int mat [][] = {{ 0, 1, 0 },
                        { 0, 0, 0 },
                        { 0, 1, 0 }};

        System.out.println(celebrityProblem(3, mat));
    }

    public static int celebrityProblem(int n, int mat [][]){
        int outer [] = new int [n];
        int inner [] = new int [n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                int x = mat[i][j];

                outer[i]+= x;
                inner[j]+= x;
            }
        }

        System.out.println(Arrays.toString(outer));
        System.out.println(Arrays.toString(inner));

        for (int i=0; i<n; i++){
            if (inner[i] == n-1 && outer[i] == 0){
                return i;
            }
        }
        return -1;
    }
}
