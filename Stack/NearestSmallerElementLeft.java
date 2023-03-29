// package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerElementLeft {
    public static void main(String[] args) {
        int arr [] = {7,2,4,6,9,3,8,11};  // --> [-1, -1, 2, 4, 6, 2, 3, 8] answer output
        nearestSmaller(arr);
        bruteForceApproach(arr);
        nearestSmallerLeft(arr);
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

    public static void bruteForceApproach(int arr []){
        int n = arr.length;
        int ans [] = new int [n];

        for (int i=n-1; i>=0; i--){
            int res = -1;
            for (int j=i-1; j>=0; j--){
                if (arr[i] > arr[j]){
                    res = arr[j];
                    break;
                }
            }
            ans[i] = res;
        }
        System.out.println(Arrays.toString(ans));
    }

    public static void nearestSmallerLeft(int arr []){
        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        int res [] = new int [n];

        for (int i=0; i<n; i++){
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
        System.out.println(Arrays.toString(res));
    }
}
