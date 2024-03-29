public class TripletSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        int k = 9;

        tripletSum(nums, k);
    }

    /**
     * The function `tripletSum` takes an array of integers and a target sum as input, and finds all
     * triplets in the array that add up to the target sum.
     * 
     * @param arr An array of integers
     * @param k The value of k is the target sum that we are looking for in the array.
     */
    public static void tripletSum(int arr [], int k){
        int n = arr.length;

        int l,r;

        for (int i=0; i<n-2; i++){
            
            l = i+1;
            r = n-1;

            while (l < r){
                int sum = arr[i]+arr[l]+arr[r];

                if (sum == k){
                    System.out.println(arr[i]+" "+arr[l]+" "+arr[r]);
                    l++;
                    r--;
                }else if (sum < k){
                    l++;
                }else {
                    r--;
                }
            }
        }
    }
}
