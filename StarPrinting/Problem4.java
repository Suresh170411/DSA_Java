package StarPrinting;

/*
 *      *
 *      * *
 *      * * *
 *      * * * *
 *      * * * * *
 */

public class Problem4 {
    // right triangle
    public static void main(String[] args) {
        printStars(5);
    }

    public static void printStars(int size){
        for (int i=1; i<=size; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
