// package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int arr [] = {100,80,60,70,60,75,85};
        bruteForceApproach(arr);
        stockSpanPrint(arr);
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
}
