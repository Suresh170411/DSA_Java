package Stack;

import java.util.*;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        int arr [] = {2,5,1,7,6};
        previousGreaterElementBF(arr);
        System.out.println(Arrays.toString(nextGreaterElement(arr)));
    }

    public static int [] nextGreaterElement(int arr []){
        
        int n = arr.length;

        int res [] = new int [n];
        Stack<Integer> st = new Stack<>();

        res[0] = -1;
        st.push(0);

        for (int i=1; i<n; i++){
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
        return res;
    }

    public static void previousGreaterElementBF(int arr []){
        int n = arr.length;
        int [] result = new int [n];
        for (int i=n-1; i>=0; i--){
            int res = -1;
            for (int j=i-1; j>=0; j--){
                if (arr[i] > arr[j]){
                    res = arr[j];
                    break;
                }
            }
            result[i] = res;
        }

        System.out.println(Arrays.toString(result));
    }
}
