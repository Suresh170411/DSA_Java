import java.util.Arrays;
import java.util.Stack;

public class GreaterElementToLeft {
    public static void main(String[] args) {
        int arr [] = {1,6,4,10,2,5};
        ngl(arr);
    }
    public static void ngl(int arr []){
        int n = arr.length;
        int res [] = new int [n];

        Stack<Integer> st = new Stack<>();

        res[0] = -1;
        st.push(0);

        for (int i=1; i<n; i++){
            while (!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }
            res[i] = !st.isEmpty() ? arr[st.peek()] : -1;
            st.push(i);
        }
        System.out.println(Arrays.toString(res));
    }
}
