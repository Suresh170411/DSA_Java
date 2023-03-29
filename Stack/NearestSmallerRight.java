// package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerRight {
    public static void main(String[] args) {
        int arr [] = {7,2,4,6,9,3,8,11};
        nextGreaterRight(arr);
    }
    
    public static void nextGreaterRight(int [] arr){
        int n = arr.length;
        int res [] = new int [n];
        Stack<Integer> st = new Stack<>();

        res[n-1] = -1;
        st.push(n-1);
        
        for (int i=n-2; i>=0; i--){
            while (!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            if (!st.isEmpty()){
                res[i] = arr[st.peek()];
            }else {
                res[i] = -1;
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(res));
    }
}
