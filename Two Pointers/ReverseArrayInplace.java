// package Two Pointers;

import java.util.Arrays;

public class ReverseArrayInplace {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8};

        solution(arr);
    }

    /**
     * The function reverses the elements in an array and prints the reversed array.
     * 
     * @param arr The parameter `arr` is an array of integers.
     */
    public static void solution(int arr []){
        int left = 0;
        int right = arr.length-1;

        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
