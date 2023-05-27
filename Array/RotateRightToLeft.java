public class RotateRightToLeft{
    public static void main(String[] args) {
        
        int arr [] = {1,2,3,4};
        int n = arr.length;
        int k = 2;

        rotateArrayForKTimes(n,k,arr);
    }

    public static void rotateArrayForKTimes(int n, int k, int arr []){
    
    k = k%n;
    
    for(int i = 0; i < n; i++){
        if(i<k){
            System.out.print(arr[n+i-k] +" ");
        }else{
            System.out.print(arr[i-k] +" ");
        }
    }
    System.out.println();
  }
}