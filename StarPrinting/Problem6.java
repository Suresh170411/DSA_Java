package StarPrinting;

/*
 *      *
 *      * *
 *      * * *
 *      * * * *
 *      * * *
 *      * *
 *      *
 */

public class Problem6 {
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

        // for (int i=3; i>=1; i--){
        //     for (int j=1; j<=i; j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        for (int i=1; i<size; i++){
            for (int j=1; j<size-i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
