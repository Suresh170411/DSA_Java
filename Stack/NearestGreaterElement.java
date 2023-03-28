package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NearestGreaterElement {
    public static void main(String[] args) {
        int arr [] = {39,27,11,4,24,32,32,1};
        int left [] = leftSmaller(arr);
        int right [] = rightSmaller(arr);

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

    }
    
    public static int [] leftSmaller(int arr []){
        int res [] = new int [arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i=0; i<arr.length; i++){
            while (!st.isEmpty() && arr[i] <= st.peek()){
                st.pop();
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

    public static int [] rightSmaller(int arr []){
        int res [] = new int [arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i=arr.length-1; i>=0; i--){
            while (!st.isEmpty() && arr[i] <= st.peek()){
                st.pop();
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
}
