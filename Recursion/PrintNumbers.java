
/**
 * Print from 5 to 1 without using any loop
 * 
 * Hint : Use Recursion
 * 
 * Input : 5 to 1
 * Output : 5 4 3 2 1
 */

public class PrintNumbers {
    public static void main(String[] args) {
        int n = 5;
        printNumbers(n);
    }

    public static void printNumbers(int n){
        
        if (n == 0){
            return;
        }

        System.out.println(n);
        printNumbers(n-1);
    }
}
