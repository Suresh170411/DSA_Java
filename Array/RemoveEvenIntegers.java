package Array;

import java.util.Arrays;

public class RemoveEvenIntegers {
    public static void main(String[] args) {
        int arr [] = {3,2,6,1,9,8,7};
        RemoveEvenIntegers demo = new RemoveEvenIntegers();

        demo.printArray(arr);
    }

    public int [] removeEven(int [] arr){
        int count = 0;

        for (int i=0; i<arr.length; i++){
            if (arr[i]%2 == 1){
                count++;
            }
        }
        int [] oddArray = new int [count];

        int index = 0;

        for (int i=0; i<arr.length; i++){
            if (arr[i]%2 == 1){
                oddArray[index++] = arr[i];
            }
        }
        return oddArray;
    }

    public void printArray(int [] arr){

        int [] res = removeEven(arr);

        System.out.println(Arrays.toString(res));
    }
}
