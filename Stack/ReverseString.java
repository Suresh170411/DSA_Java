// package Stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str){
        Stack<Character> stack = new Stack<>();

        char [] arr = str.toCharArray();

        for (char c : arr){
            stack.push(c);
        }
        for (int i=0; i<str.length(); i++){
            arr[i] = stack.pop();
        }
        return new String(arr);
    }
}
