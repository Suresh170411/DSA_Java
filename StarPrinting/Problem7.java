package StarPrinting;

/*
                      * 
                   *  *
                *  *  *
             *  *  *  *
          *  *  *  *  *     
 */


public class Problem7 {
    public static void main(String[] args) {
        printStar(5);
        printStar2(5);
    }

    public static void printStar(int size){
        for (int i=0; i<size; i++){
            for (int j=0; j<size-i-1; j++){
                System.out.print("   ");
            }
            for (int st=0; st<=i; st++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void printStar2(int size){
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                //print space
                if (j < size-i-1){
                    System.out.print("   ");
                }else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
