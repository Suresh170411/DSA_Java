public class SubArrayVSW {
    public static void main(String[] args) {
        int arr [] = {1,4,20,3,10,5};
        int sum = 33;

        boolean res = subarraysumVariableSizeSW(arr, sum);
        System.out.println(res);
    }

    public static boolean subarraysumVariableSizeSW(int arr [], int sum){
        int windowSum = 0;
        int left = 0;

        for (int i=0; i<arr.length; i++){
            while(windowSum < sum){
                windowSum+= arr[left];
                left++;
            }
        
            if (windowSum == sum){
                return true;
            }
            windowSum = windowSum - arr[i];
        }
        return false;
    }
}
