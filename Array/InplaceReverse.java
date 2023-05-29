

public class InplaceReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverseArray(arr.length,2,arr);
    }

    /**
     * The function reverses subarrays of length k within an array of length n.
     * 
     * @param n The total number of elements in the array.
     * @param k The parameter "k" in the method "reverseArray" represents the size of the subarray that
     * needs to be reversed.
     * @param arr an integer array that needs to be reversed in parts
     */
    public static void reverseArray(int n, int k, int arr []){
        int left=0;
        int right=k;
        
        while (left < right){
            
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
