
/**
 * Print from 1 to 5 without using any loop
 * 
 * Hint : Use Recursion
 * 
 * Input : 1 to 5
 * Output : 1 2 3 4 5
 */

public class PrintNumbers2 {
    public static void main(String[] args) {
        
        int start = 1;
        int end = 5;
        printNumbers(start,end);
    }

    public static void printNumbers(int start, int end){

        if (start == end+1){
            return;
        }

        System.out.println(start);
        printNumbers(start+1, end);
    }
}
