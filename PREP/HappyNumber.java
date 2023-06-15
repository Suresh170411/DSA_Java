import java.util.HashSet;

/**
 * A number is called happy if it leads to 1 after a sequence of steps wherein each step number 
 * is replaced by the sum of squares of its digit that is if we start with Happy Number and keep 
 * replacing it with digits square sum, we reach 1. 
 * 
 *  Input: n = 19
    Output: True

        19 is Happy Number,
        1^2 + 9^2 = 82
        8^2 + 2^2 = 68
        6^2 + 8^2 = 100
        1^2 + 0^2 + 0^2 = 1

        As we reached to 1, 19 is a Happy Number.

    Input: n = 20
    Output: False
 */


public class HappyNumber {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappyNumber(n));
    }

    // function for number square sum
    public static int numberSquareSum(int n){
        int sum = 0;
        while (n > 0){
            sum+= (n%10)*(n%10);
            n = n/10;
        }
        return sum;
    }

    // happy number checking method
    /**
     * The function checks if a given number is a happy number by repeatedly squaring its digits and
     * checking if the resulting sum equals 1 or if it enters a cycle.
     * 
     * @param n The input integer for which we want to check if it is a happy number or not.
     * @return The method `isHappyNumber` returns a boolean value. It returns `true` if the input
     * integer `n` is a happy number, and `false` otherwise.
     */
    public static boolean isHappyNumber(int n){
        HashSet<Integer> st = new HashSet<>();

        while (true){
            n = numberSquareSum(n);
            if (n == 1){
                return true;
            }
            if (st.contains(n)){
                return false;
            }
            st.add(n);
        }
    }
}
