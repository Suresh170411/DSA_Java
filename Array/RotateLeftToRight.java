import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class RotateLeftToRight {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4};
        int n = arr.length;
        int d = 2;

        rotateLeftToRight(n, d, arr);
        // rotateLeftToRightUsingQueue(n, d, arr);
    }

    public static void rotateLeftToRight(int n, int d, int arr []){
        // Storing rotated version of array
        int temp[] = new int[n];
    
        // Keeping track of the current index
        // of temp[]
        int k = 0;
    
        // Storing the n - d elements of
        // array arr[] to the front of temp[]
        for (int i = d; i < n; i++) {
            temp[k] = arr[i];
            k++;
        }
    
        // Storing the first d elements of array arr[]
        //  into temp
        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }
    
        // Copying the elements of temp[] in arr[]
        // to get the final rotated array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        System.out.println(Arrays.toString(arr));
    }

    /**
     * The function rotates the elements of an integer array to the right by a given number of
     * positions using a queue.
     * 
     * @param n The size of the array.
     * @param k The number of positions to rotate the array to the right.
     * @param arr an integer array containing the elements to be rotated
     */
    public static void rotateLeftToRightUsingQueue(int n, int k, int arr []){
        Deque<Integer> deq = new ArrayDeque<>();
        for (int i : arr) {
            deq.add(i);
        }
 
        for (int i = 0; i < k; i++) {
            int temp = deq.remove();
            deq.addLast(temp);
        }
 
        System.out.println(deq);
    }
}
