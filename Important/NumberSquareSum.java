package Important;
public class NumberSquareSum {
    public static void main(String[] args) {
        System.out.println(numberSquareSum(19));
    }

    // 19 --> 1 - 9
    // 1^2 + 9^2 = 82

    /**
     * The function calculates the sum of the squares of the digits of a given number.
     * 
     * @param n The parameter "n" in the method "numberSquareSum" represents an integer number.
     * @return The method is returning the sum of the squares of the digits of the given number.
     */
    public static int numberSquareSum(int n){
        int sum = 0;
        while (n > 0){
            sum+= (n%10)*(n%10);
            n = n/10;
        }
        return sum;
    }
}
