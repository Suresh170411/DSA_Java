package StarPrinting;

public class Problem1 {
    public static void main(String[] args) {
        
        printStars(5, 4);
        printChars(5, 4);
        printNums(5, 4);
        
    }
    /**
     * The function prints a rectangular pattern of stars with the specified number of rows and
     * columns.
     * 
     * @param row The number of rows in the pattern of stars to be printed.
     * @param column The number of columns in the grid of stars that will be printed.
     */
    public static void printStars(int row, int column){
        for (int i=1; i<=row; i++){
            for (int j=1; j<=column; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    /**
     * The function prints a grid of characters from 'a' to 'z' with the specified number of rows and
     * columns.
     * 
     * @param row The number of rows to be printed.
     * @param column The number of characters to be printed in each row.
     */
    public static void printChars(int row, int column){
        String str = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;
        for (int i=1; i<=row; i++){
            for (int j=1; j<=column; j++){
                System.out.print(str.charAt(count)+" ");
                count++;
            }
            System.out.println();
        }
    }

    /**
     * The function prints a matrix of numbers from 1 to row*column.
     * 
     * @param row The number of rows to be printed.
     * @param column The parameter "column" represents the number of columns in the grid that will be
     * printed by the method "printNums".
     */
    public static void printNums(int row, int column){
        int count = 0;
        for (int i=1; i<=row; i++){
            for (int j=1; j<=column; j++){
                System.out.print(++count+" ");
            }
            System.out.println();
        }
    }
}
