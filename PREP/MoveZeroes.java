import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int arr [] = {3,0,6,1,0,8,0,2};

        moveZeroesToLeft(arr);
        moveZeroesToRight(arr);
    }
    // method for moving all the zeroes of the array to the Right/Last
    public static void moveZeroesToRight(int arr []){
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

    // method for moving all the zeroes of the array to the Left/First
    public static void moveZeroesToLeft(int arr []){
        int n = arr.length;
        int j = n - 1;

        for (int i=n-1; i>=0; i--){
            if (arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0){
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
