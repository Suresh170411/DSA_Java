import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int arr [] = {1,5,2,6,9,7};
        bruteForceApproach(arr);
        getSecondLargestElement(arr);
    }

    public static void bruteForceApproach(int arr []){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i=0; i<n; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] != max && arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }

    public static void getSecondLargestElement(int arr []){
        int n = arr.length;

        Arrays.sort(arr);

        for (int i=n-2; i>=0; i--){
            if (arr[i] != arr[i-1]){
                System.out.println(arr[i]);
                return;
            }
        }
    }
}
