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
}
