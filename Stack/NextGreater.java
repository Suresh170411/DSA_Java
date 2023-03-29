// package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int arr [] = {1,6,5,7,3};

        check(arr);

    }

    public static void check(int arr []){
        int res1 [] = nextGreaterElementLeft(arr);
        int res2 [] = nextGreaterElementRight(arr);

        System.out.println(Arrays.toString(res1));
        System.out.println(Arrays.toString(res2));
    }

    public static int [] nextGreaterElementRight(int [] arr){

        int res [] = new int [arr.length];

        for (int i=0;  i<arr.length; i++){
            int fix = -1;
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] < arr[j]){
                    fix = arr[j];
                    break;
                }
            }
            res[i] = fix;
        }
        return res;
    }

    public static int [] nextGreaterElementLeft(int [] arr){
        int n = arr.length;
        int res [] = new int [n];
        Stack<Integer> st = new Stack<>();

        res[0] = -1;
        st.push(0);

        for (int i=1; i<n; i++){
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]){
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
}
