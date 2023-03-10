package Array;

public class ArrayCreation {
    public static void main(String[] args) {
        ArrayCreation demo = new ArrayCreation();

        demo.araryDemo();
    }

    public void araryDemo(){
        int [] arr = new int [5];
        printArray(arr);
    }

    public void printArray(int arr []){
        int n = arr.length;

        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
