/**
 * Calculate sum of N natural numbers using recursion
 * 
     Input
     3
     Output
     6

     Explanation
     3 -> 3 + 2 + 1 = 6
 */

public class SumOfNnaturalNums {
    public static void main(String[] args) {
        int n = 3;
        
        System.out.println(printSumOfNnaturalNumbers(n));
        System.out.println(BruteForceApproach(n));
    }

    // Recursive approach for calculating the sum of N natural numbers
    public static int printSumOfNnaturalNumbers(int n){

        if (n == 0 || n == 1){
            return n;
        }
        return n + printSumOfNnaturalNumbers(n-1);
    }

    // Brute force approach for calculating the sum of N natural numbers
    public static int BruteForceApproach(int n){
        int sum = 0;

        for (int i=1; i<=n; i++){
            sum+= i;
        }
        return sum;
    }
}
