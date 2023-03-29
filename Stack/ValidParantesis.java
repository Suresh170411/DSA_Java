// package Stack;

import java.util.Stack;

/** VALID PARENTESES  (EASY)
  * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */


public class ValidParantesis {
    public static void main(String[] args) {
        String str = "({[])";
        System.out.println(validParanthesis(str));
    }

    public static boolean validParanthesis(String str){
        Stack<Character> st = new Stack<>();

        for (char c : str.toCharArray()){
            if (c == '(' || c == '{' || c == '['){
                st.push(c);
            }else {
                if (st.isEmpty()) return false;
                char top = st.pop();

                if (c == ')' && (top == '{' || top == '[')){
                    return false;
                }
                if (c == '}' && (top == '(' || top == '[')){
                    return false;
                }
                if (c == ']' && (top == '{' || top == '(')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
