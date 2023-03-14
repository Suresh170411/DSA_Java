package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerElementLeft {
    public static void main(String[] args) {
        int arr [] = {7,2,4,6,9,3,8,11};  // --> [-1, -1, 2, 4, 6, 2, 3, 8] answer output
        nearestSmaller(arr);
    }
    public static void nearestSmaller(int arr []){
        int n = arr.length;
        int res [] = new int [n];
        Stack<Integer> st = new Stack<>();

        res[0] = -1;
        st.push(0);

        for (int i=1; i<n; i++){
            while (!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            res[i] = !st.isEmpty() ? arr[st.peek()] : -1;
            st.push(i);
        }
        System.out.println(Arrays.toString(res));
    }
}
