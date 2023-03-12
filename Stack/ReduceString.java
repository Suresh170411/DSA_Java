package Stack;

import java.util.Stack;

public class ReduceString {
    public static void main(String[] args) {
        String str = "aaabbbccd";
        reduceString(str);
    }
    public static void reduceString(String str){
        Stack<Character> st = new Stack<>();

        char arr [] = str.toCharArray();

        for (int i=0; i<arr.length; i++){
            if (!st.isEmpty() && st.peek() == arr[i]){
                st.pop();
            }else {
                st.push(arr[i]);
            }
        }
        System.out.println(st);
    }
}
