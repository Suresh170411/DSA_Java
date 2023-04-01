
/**
 * Can You Find The Sum? (Mid)
 * ---------------------
 * 
 * Teena is very good at competitive programming. She solved enough programming on arrays and 
 * her friend wants to test her knowledge in array. So she gave her following task.
 * 
 * - The problem is given an Array A having N integers, for each element i (1 <= i <= N). 
 *   Find (x+y) where x  is the largest number less than i such that A[x] > A[i] and y is the 
 *   smallest number greater than i such that A[y] > A[i].
 * - If there is no x<i such that A[x] > A[i], then take x = -1. Similaryly, if there is no y > i
 *   such that A[y] > A[i], then take y = -1.
 * 
 * Input
 * -----
 *  5
 *  5 4 1 3 2
 * 
 * Output
 * ------
 *  -2 0 6 1 3
 */


import java.util.Stack;

public class CanYouFindTheSum {
    public static void main(String[] args) {
        int arr [] = {5,4,1,3,2};
        int left [] = nearestGreaterElementLeft(arr);
        int right [] = nearestGreaterElementRight(arr);
        
        for (int i=0; i<left.length; i++){
            System.out.print(left[i]+right[i] + " ");
        }
        System.out.println();
    }
    
    public static int [] nearestGreaterElementLeft(int arr []){
        int n = arr.length;
        int res [] = new int [n];
        Stack<Integer> st = new Stack<>();

        res[0] = -1;
        st.push(0);

        for (int i=1; i<n; i++){
            while (!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }
            res[i] = !st.isEmpty() ? st.peek()+1 : -1;
            st.push(i);
        }
        return res;
    }

    public static int [] nearestGreaterElementRight(int arr []){
        int n = arr.length;
        int res [] = new int [n];
        Stack<Integer> st = new Stack<>();

        res[n-1] = -1;
        st.push(n-1);

        for (int i=n-2; i>=0; i--){
            while (!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }
            res[i] = !st.isEmpty() ? st.peek()+1 : -1;
            st.push(i);
        }
        return res;
    }
}
