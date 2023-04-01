

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };

        int n = removeDups(arr);

        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int removeDups(int arr []){
        int n = arr.length;

        if (n == 0 || n == 1){
            return n;
        }

        int res [] = new int [n];

        int index = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                res[index++] = arr[i];
            }
        }
        res[index++] = arr[n-1];

        for (int i=0; i<index; i++){
            arr[i] = res[i];
        }
        
        return index;
    }
}
