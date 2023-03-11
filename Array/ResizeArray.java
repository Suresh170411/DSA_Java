public class ResizeArray {
    public static void main(String[] args) {
        int arr [] = {1,2,4,5};
        int [] res = resizeArray(arr, 8);
        printArray(res);
    }

    // we use existing array elements to assing into new updated array
    public static int [] resizeArray(int [] arr, int updateSize){
        int [] temp = new int [updateSize];
        for (int i=0; i<arr.length; i++){
            temp[i] = arr[i];
        }
        return temp;
    }

    public static void printArray(int arr []){
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
