package Stack;

import java.util.Arrays;

public class NextGreater {
    public static void main(String[] args) {
        int arr [] = {1,6,5,7,3};

        check(arr);

    }

    public static void check(int arr []){
        int res1 [] = nextGreaterElementLeft(arr);
        int res2 [] = nextGreaterElementRight(arr);

        System.out.println(Arrays.toString(res1));
        System.out.println(Arrays.toString(res2));
    }

    public static int [] nextGreaterElementRight(int [] arr){

        int res [] = new int [arr.length];

        for (int i=0;  i<arr.length; i++){
            int fix = -1;
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] < arr[j]){
                    fix = arr[j];
                    break;
                }
            }
            res[i] = fix;
        }
        return res;
    }

    public static int [] nextGreaterElementLeft(int [] arr){
        int res [] = new int [arr.length];
        int n = arr.length;

        for (int i=n-1; i>=0; i--){
            int fix = -1;
            for (int j=i-1; j>=0; j--){
                if (arr[i] < arr[j]){
                    fix = arr[j];
                }
            }
            res[i] = fix;
        }
        return res;
    }
}
