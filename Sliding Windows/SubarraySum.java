// package Sliding Windows;

import java.util.ArrayList;
import java.util.List;

public class SubarraySum {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        int k = 4;
        bruteForce(arr,k);
        slidingWindowApproach(arr, k);
    }

    public static void bruteForce(int arr [], int K){

        // int n = arr.length;

        List<String> list = new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                String bag = "";
                for (int k=i; k<=j; k++){
                    bag+= arr[k];
                }
                if (bag.length() == K) list.add(bag);
            }
        }
        
        int max = Integer.MIN_VALUE;

        for (String s : list){
            String str [] = s.split("");
            int sum = 0;
            for (String i : str){
                sum+= Integer.parseInt(i);
            }
            if (sum > max){
                max = sum; 
            }
        }
        System.out.println(max);
    }

    public static void slidingWindowApproach(int arr [], int k){
        int n = arr.length;

        int max = Integer.MIN_VALUE;

        for (int i=0; i<=n-k; i++){
            int sum = 0;

            for (int j=i; j<=i+k-1; j++){
                sum+= arr[j];
            }
            if (sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
