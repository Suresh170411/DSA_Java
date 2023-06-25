// package Sliding Windows;

import java.util.ArrayList;
import java.util.List;

public class SubarraySum {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        bruteForce(arr);
    }

    public static void bruteForce(int arr []){

        // int n = arr.length;

        List<String> list = new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                String bag = "";
                for (int k=i; k<=j; k++){
                    bag+= arr[k];
                }
                if (bag.length() == 4) list.add(bag);
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
}
