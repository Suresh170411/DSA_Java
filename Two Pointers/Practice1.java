import java.util.Arrays;

public class Practice1{
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};

        int k = 6;

        bruteForceApproach(arr, k);
        twoPointersPractice(arr, k);
        

    }

    public static void bruteForceApproach(int arr [], int k){
        
        int count = 0;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]+arr[j] == k){
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void twoPointersPractice(int arr [], int k){
        int left = 0;
        int right = arr.length-1;

        int count = 0;
        Arrays.sort(arr);
        
        while (left < right){
            int sum  = arr[left]+arr[right];

            if (sum < k){
                left++;
            }else if (sum > k){
                right--;
            }else {
                count++;
                left++;
                right--;
            }
        }

        System.out.println(count);
    }
}