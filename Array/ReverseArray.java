
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr [] = {3,5,1,6,7};
        
        reverseArrayA(arr);
        reverseArrayB(arr,0,arr.length-1);
    }

    // brute force approach
    public static void reverseArrayA(int [] arr){

        int result [] = new int [arr.length];
        int index = 0;
        
        for (int i=arr.length-1; i>=0; i--){  
            result[index++] = arr[i];
        }
        
        System.out.println(Arrays.toString(result));
    }

    // in-place rotaion elements in an array
    public static void reverseArrayB(int arr [], int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
