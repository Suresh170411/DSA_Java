public class RemoveDups {
    public static void main(String[] args) {
        int arr [] = {1,1,2,3,4,4,5,6};

        bruteForce(arr);
    }

    public static void bruteForce(int arr []){
        int n = arr.length;

        int j = 0;

        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                arr[j] = arr[i];
                j++;
            }
        }
        
        arr[j] = arr[n-1];

        for (int i=0; i<=j; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
