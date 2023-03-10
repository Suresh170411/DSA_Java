package Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr [] = {3,5,1,6,7};
        
        reverseArraya(arr);
    }

    public static void reverseArraya(int [] arr){

        int result [] = new int [arr.length];
        int index = 0;
        
        for (int i=arr.length-1; i>=0; i--){  
            result[index++] = arr[i];
        }
        
        System.out.println(Arrays.toString(result));
    }
}
