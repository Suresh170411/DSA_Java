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
