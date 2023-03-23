import java.util.Arrays;
import java.util.TreeSet;

public class FindSecondMax {
    public static void main(String[] args) {
        int [] arr = {3,5,8,8,1,7,0,2,7};
        System.out.println(getSecondMax(arr));
        printSecondMaxElement(arr);
    }
    public static int getSecondMax(int arr []){
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i=0; i<n; i++){
            if (arr[i] > max){
                secondMax = max;
                max = arr[i];
            }

            if (arr[i] > secondMax && arr[i] < max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void printSecondMaxElement(int arr []){
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i : arr){
            ts.add(i);
        }
        ts.remove(ts.last());

        System.out.println("Second Largest Element is : " + ts.last());
    }
}
