

public class InplaceReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverseArray(arr.length,2,arr);
    }

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
