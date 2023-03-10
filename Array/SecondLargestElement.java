package Array;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int [] arr = {3,6,1,6,2,0,8,9};

        System.out.println(findSecondLargest(arr));
    }

    // brute force approach
    public static int findSecondLargestElement(int arr []){
        int max = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        int res = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){
            if (arr[i] != max){
                if (arr[i] > res){
                    res = arr[i];
                }
            }
        }
        return res;
    }

    public static void secondLargest(int [] arr){
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }

    public static int findSecondLargest(int [] arr){
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                secondLargest = max;
                max = arr[i];
            }else if (arr[i] > secondLargest && arr[i] != max){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
