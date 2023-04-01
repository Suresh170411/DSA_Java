/**
 * 
 * input
 * -----
        3
        1 2 3
        4 5 6
        7 8 9
    
    output
    ------
        7 4 1 
        8 5 2
        9 6 3

 */


public class RotateClockwise {
    public static void main(String[] args) {
        int mat [][] = {{1,2,3},{4,5,6},{7,8,9}};
        int N = mat.length;

        int top=0;
        int left=0;
        int bottom=N-1;
        // int right=N-1;
        
        int count=0;
        while (count<N*N){
            String bag="";
            for (int i=bottom; i>=top; i--){
                bag+=(mat[i][left])+" ";
                count++;
            }
            left++;
            System.out.println(bag);
        }
    }

    public static void optimizedApproach(int[][]arr,int n){
        
        for (int i=0; i<n/2; i++){
            for (int j=i; j<n-i-1; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[n-j-1][i];
                arr[n-j-1][i] = arr[n-i-1][n-j-1];
                arr[n-i-1][n-j-1] = arr[j][n-i-1];
                arr[j][n-i-1] = temp;
            }
        }
        
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
