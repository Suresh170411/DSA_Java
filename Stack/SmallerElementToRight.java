import java.util.Arrays;
import java.util.Stack;

public class SmallerElementToRight {
    public static void main(String[] args) {
        int arr [] = {1,6,4,10,2,5};
        check(arr);
    }
    public static void check(int arr []){
        int n = arr.length;
        int res [] = new int [n];

        Stack<Integer> st = new Stack<>();

        res[n-1] = -1;
        st.push(n-1);

        for (int i=n-2; i>=0; i--){
            while (!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            res[i] = !st.isEmpty() ? arr[st.peek()] : -1;
            st.push(i);
        }
        System.out.println(Arrays.toString(res));
    }
}
