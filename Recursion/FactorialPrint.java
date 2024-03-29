
/**
 * Find the factorial of the given number.
 * 
     Input
     5
     Output
     120

     Explaination

     5! = 5 x 4 x 3 x 2 x 1

     n! = n * (n-1) * (n-2) * (n-3) * ... * 1
 */

public class FactorialPrint {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(getFactorial(n));
    }
    
    /**
     * The function calculates the factorial of a given number recursively.
     * 
     * @param n The parameter "n" represents the number for which we want to calculate the factorial.
     * @return The factorial of the given number 'n' is being returned.
     */
    public static int getFactorial(int n){
        
        if (n == 0 || n == 1){
            return n;
        }
        return n * getFactorial(n-1);
    }
}
