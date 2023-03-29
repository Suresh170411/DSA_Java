// package Stack;

import java.util.Stack;

public class ReduceString {
    public static void main(String[] args) {
        String str = "aaaaaaaa";
        reduceString(str);
        String res = bruteForceApproach(str);
        System.out.println(res);
    }
    public static void reduceString(String str){
        Stack<Character> st = new Stack<>();

        for (int i=0; i<str.length(); i++){
            char x = str.charAt(i);

            if (!st.isEmpty() && st.peek() == x){
                st.pop();
            }else {
                st.push(x);
            }
        }
        StringBuilder sb = new StringBuilder();

        for (Character c : st){
            sb.append(c);
        }

        if (st.isEmpty()){
            System.out.println("Empty!");
        }else {
            System.out.println(sb.toString());
        }
    }

    // reduce String brute force approach
    public static String bruteForceApproach(String str){

        StringBuilder sb = new StringBuilder(str);
        
        boolean havePair = true;
        while (havePair){
            havePair = false;
            for (int i=0; i<sb.length()-1; i++){
                if (sb.charAt(i) == sb.charAt(i+1)){
                    sb.delete(i, i+2);
                    havePair = true;
                    break;
                }
            }
        }
        if (sb.length() == 0){
            return "EMPTY";
        }else {
            return sb.toString();
        }
    }
}
