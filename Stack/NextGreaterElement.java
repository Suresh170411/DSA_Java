package Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr [] = {10,2,4,3,8,9,1};
        nextGreaterBF(arr);
    }

    // brute force approach for finding next greater element
    public static void nextGreaterBF(int [] arr){
        int res;
        for (int i=0; i<arr.length; i++){
            res = -1;
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] < arr[j]){
                    res = arr[j];
                    break;
                }
            }
            System.out.print(res+" ");
        }
    }

    
}
