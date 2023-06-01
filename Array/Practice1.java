import java.util.Arrays;

public class Practice1{
    public static void main(String[] args) {
        int arr [] = {4,1,5,3,6,8};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("Least element is : " + arr[0]);

        
        
    }

    public static void findMin(int arr []){
        int minimum = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i] < minimum){
                minimum = arr[i];
            }
        }
        System.out.println(minimum);

        // 4,1,5,3,0,8

        /**
         * arr[0] ----> 4   4 < 4 (F)
         * 
         * arr[1] ----> 1   1 < 4 (T) ---> 1
         * 
         * arr[2] ----> 5   5 < 1 (F)
         * 
         * arr[3] ----> 3   3 < 1 (F)
         * 
         * arr[4] ----> 0   0 < 1 (T) ---> 0
         * 
         * arr[5] ----> 8   8 < 1 (F)
         */
    }
}