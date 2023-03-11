import java.util.Arrays;

public class MoveZeroesToLeft {
    public static void main(String[] args) {

        int arr [] = {1,0,5,8,0,12};

        moveZeroes(arr);
    }

    public static void moveZeroes(int [] arr){
        int n = arr.length;
        int j = n-1;

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
