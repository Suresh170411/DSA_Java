package Array2D;

import java.util.Arrays;

public class Spiral {
    public static void main(String[] args) {
        int mat [][] = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};

        System.out.println(Arrays.deepToString(mat));

        int n = mat.length;
        int m = mat[0].length;

        spiralTraversal(n, m, mat);

        /**
         *    <-------
         * |  |    ^  |
         * |  |    | |
         * |  ---->  |
         * ---------->
         */
    }

    /**
     * The `spiralTraversal` function takes in a 2D array `arr` of size `n` by `m` and prints the
     * elements of the array in a spiral order.
     * 
     * @param n The number of rows in the 2D array.
     * @param m The number of columns in the array.
     * @param arr The arr parameter is a 2D array of integers. It represents a matrix with n rows and m
     * columns.
     */
    public static void spiralTraversal(int n, int m, int [][] arr){
        int top=0;
        int left=0;
        int bottom=n-1;
        int right=m-1;
        int count=0;
        
        
        StringBuilder sb = new StringBuilder();
        
        while(count<n*m){
          for (int i=top; i<=bottom && count<n*m; i++){
            sb.append(arr[i][left]+" ");
            count++;
          }
          left++;
          for (int i=left; i<=right && count<n*m; i++){
            sb.append(arr[bottom][i]+" ");
            count++;
          }
          bottom--;
          for (int i=bottom; i>=top && count<n*m; i--){
            sb.append(arr[i][right]+" ");
            count++;
          }
          right--;
          for (int i=right; i>=left && count<n*m; i--){
            sb.append(arr[top][i]+" ");
            count++;
          }
          top++;
        }
        System.out.println(sb);
    }
}
