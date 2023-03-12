package Stack;

import java.util.Arrays;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        int arr [] = {2,5,1,7,6};
        previousGreaterElementBF(arr);
    }
    public static void previousGreaterElementBF(int arr []){
        int n = arr.length;
        int [] result = new int [n];
        for (int i=n-1; i>=0; i--){
            int res = -1;
            for (int j=i-1; j>=0; j--){
                if (arr[i] < arr[j]){
                    res = arr[j];
                    break;
                }
            }
            result[i] = res;
        }

        System.out.println(Arrays.toString(result));
    }
}
