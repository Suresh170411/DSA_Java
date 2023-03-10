package Array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int arr [] = {1,0,4,0,12};

        moveZeros(arr);
    }

    public static void moveZeros(int arr []){
        int n = arr.length;
        int j = 0;

        for (int i=0; i<n; i++){
            if (arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0){
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
