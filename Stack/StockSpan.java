package Stack;

import java.util.Arrays;

public class StockSpan {
    public static void main(String[] args) {
        int arr [] = {100,80,60,70,60,75,85};
        bruteForceApproach(arr);
    }
    public static void bruteForceApproach(int arr []){
        int n = arr.length;

        int res [] = new int [n];
        
        for (int i=n-1; i>=0; i--){
            int count = 1;
            for (int j=i-1; j>=0; j--){
                if (arr[i] > arr[j]){
                    count++;
                }
            }
            res[i] = count;
        }
        System.out.println(Arrays.toString(res));
    }
}
