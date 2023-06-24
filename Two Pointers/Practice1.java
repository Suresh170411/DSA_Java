public class Practice1{
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};

        int k = 6;

        bruteForceApproach(arr, k);
        

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
}