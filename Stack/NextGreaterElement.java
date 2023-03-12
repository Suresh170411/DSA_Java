package Stack;

import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr [] = {10,2,4,3,8,9,1};
        System.out.println(Arrays.toString(nextGreaterBF(arr)));
    }

    public static int [] nextGreaterElement(int arr []){
        return new int [8];
    }

    // brute force approach for finding next greater element
    public static int [] nextGreaterBF(int [] arr){
        int n = arr.length; 

        int result [] = new int [n];

        for (int i=0; i<n; i++){
            int res = -1;
            for (int j=i+1; j<n; j++){
                if (arr[i] < arr[j]){
                    res = arr[j];
                    break;
                }
            }
            result[i] = res;
        }
        return result;
    }


}
