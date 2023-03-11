
public class ArrayCreation {
    public static void main(String[] args) {
        ArrayCreation demo = new ArrayCreation();

        demo.araryDemo();
    }

    // instantiate array and assigning values to it
    public void araryDemo(){
        int [] arr = new int [5];
        // printArray(arr);

        arr[0] = 3;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 1;
        arr[4] = 2;

        printArray(arr);
    }

    // printing all the elements of the array
    public void printArray(int arr []){
        int n = arr.length;

        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
