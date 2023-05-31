package Array2D;

public class Traverse1 {
    public static void main(String[] args) {
        int mat [][] = {{1,2,3},{4,5,6},{7,8,9}};

        // printMatrix(mat);
        // printMatRightToLeft(mat);
        // printMatrixTopToBottom(mat);
        // printButtomToTop(mat);
        printDiagonals(mat);
    }

    // Diagonal Printing of a Matrix
    public static void printDiagonals(int mat [][]){
        int n = mat.length;
        int m = mat[0].length;

        for (int i=0,j=0; i<n && j<m; i++,j++){
           System.out.print(mat[i][j]+" ");
        }
        System.out.println();

        for (int i=n-1, j=0; i>=0 && j<m; i--,j++){
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }


    // Bottom to Top fix Column Printing of a Matrix
    public static void printButtomToTop(int mat[][]){
        int n = mat.length;
        int m = mat[0].length;

        for (int i=0; i<n; i++){
            for (int j=m-1; j>=0; j--){
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }


    // Top to Bottom fix Column Printing of a Matrix
    public static void printMatrixTopToBottom(int mat [][]){
        int n = mat.length;
        int m = mat[0].length;

        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }


    // Right to Left fix Row Printing of a Matrix
    public static void printMatRightToLeft(int mat [][]){
        int n = mat.length;
        int m = mat[0].length;

        for (int i=0; i<n; i++){
            for (int j=m-1; j>=0; j--){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }


    // Printing of a Matrix
    public static void printMatrix(int mat [][]){
        int n = mat.length;
        int m = mat[0].length;

        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
