

public class FindMinAndMaxValue {
    public static void main(String[] args) {
        int [] arr = {2,5,15,7,9,0,1};

        System.out.println(findMin(arr));
        System.out.println(findMax(arr));
    }

    public static int findMin(int arr []){
        int min = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int arr []){
        int max = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
