// package Stack;

/**
  The stock span problem is a financial problem where we have a series of N daily price quotes 
  for a stock and we need to calculate the span of the stock’s price for all N days. 
  The span Si of the stock’s price on a given day i is defined as the maximum number of 
  consecutive days just before the given day, for which the price of the stock on the current 
  day is less than its price on the given day. 

Examples:

Input: N = 7, price[] = [100 80 60 70 60 75 85]
Output: 1 1 1 2 1 4 6

    Explanation: Traversing the given input span for 100 will be 1, 
    80 is smaller than 100 so the span is 1, 
    60 is smaller than 80 so the span is 1, 
    70 is greater than 60 so the span is 2 and so on. 
    Hence the output will be 1 1 1 2 1 4 6.
 */


import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int arr [] = {100,80,60,70,60,75,85};
        bruteForceApproach(arr);
        stockSpanPrint(arr);
        stockSpanOptimizedApproach(arr);

    }

    public static void stockSpanPrint(int arr []){
        int n = arr.length;
        int [] res = new int [n];
        Stack<Integer> st = new Stack<>();

        res[0] = 1;
        st.push(0);

        for (int i=1; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            if (!st.isEmpty()){
                res[i] = i-st.peek();
            }else {
                res[i] = i+1;
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(res));
    }

    public static void bruteForceApproach(int arr []){
        int n = arr.length;

        int res [] = new int [n];
        
        for (int i=n-1; i>=0; i--){
            int count = 1;
            for (int j=i-1; j>=0; j--){
                if (arr[i] > arr[j]){
                    count++;
                }
            }
            res[i] = count;
        }
        System.out.println(Arrays.toString(res));
    }

    public static void stockSpanOptimizedApproach(int arr []){
        int res [] = new int [arr.length];

        Stack<Integer> st = new Stack<>();

        res[0] = 1;
        st.push(0);

        for (int i=1; i<arr.length; i++){
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            res[i] = st.isEmpty() ? i+1 : i-st.peek();
            st.push(i);
        }
        System.out.println(Arrays.toString(res));
    }
}
