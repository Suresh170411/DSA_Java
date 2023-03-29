// package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr [] = {10,2,4,3,8,9,1};
        System.out.println(Arrays.toString(nextGreaterBF(arr)));
        System.out.println(Arrays.toString(nextGreaterElement(arr)));
        optimizedStackApproach(arr);
    }

    public static int [] nextGreaterElement(int arr []){
        
        int n = arr.length;

        int res [] = new int [n];
        Stack<Integer> st = new Stack<>();

        for (int i=n-1; i>=0; i--){
            if (!st.isEmpty()){
                while(!st.isEmpty() && st.peek() <= arr[i]){
                    st.pop();
                }
            }
            if (st.isEmpty()){
                res[i] = -1;
            }else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }

    public static void optimizedStackApproach(int arr []){
        int n = arr.length;

        int res [] = new int [n];
        Stack<Integer> st = new Stack<>();

        res[n-1] = -1;
        st.push(0);

        for (int i=n-2; i>=0; i--){
            while (!st.isEmpty() && arr[st.peek()] < arr[i]){
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

    // brute force approach for finding next greater element
    public static int [] nextGreaterBF(int [] arr){
        int n = arr.length; 

        int result [] = new int [n];

        for (int i=0; i<n; i++){
            int res = -1;
            for (int j=i+1; j<n; j++){
                if (arr[i] < arr[j]){
                    res = arr[j];
                    break;
                }
            }
            result[i] = res;
        }
        return result;
    }


}
