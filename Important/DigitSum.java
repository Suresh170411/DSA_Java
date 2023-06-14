// package Important;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(digitSum(32));
    }

    // 32 --> 3+2 = 5
    /**
     * The function digitSum calculates the sum of the digits of a given integer.
     * 
     * @param n an integer for which we want to calculate the sum of its digits.
     * @return The method `digitSum` returns an integer value which is the sum of the digits of the
     * input integer `n`.
     */
    public static int digitSum(int n){
        int sum = 0;

        while (n > 0){
            sum+= n%10;
            n = n/10;
        }
        return sum;
    }
}
