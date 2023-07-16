package StarPrinting;

/**
 *      1   2   3   4
 *      5           8
 *      9           12
 *      13  14  15  16
 */

public class Problem2 {
    public static void main(String[] args) {
        printStars(4);
        printNums(4);
    }
    
    /**
     * The function prints a square of stars with a given size, where the border is filled with stars
     * and the inside is empty.
     * 
     * @param size The size parameter determines the size of the square that will be printed. It
     * represents the number of rows and columns in the square.
     */
    public static void printStars(int size){

        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                if (i==0 || i==size-1 || j==0 || j==size-1){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void printNums(int size){
        int count = 0;

        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                count++;
                if (i==0 || i==size-1 || j==0 || j==size-1){
                    System.out.print(" "+count+" ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
