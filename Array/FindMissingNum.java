public class FindMissingNum {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6};
        System.out.println(findMissingElement(arr));
    }

    public static int findMissingElement(int arr []){
        int n = arr.length + 1; // getting the expected length by adding 1 to the array

        int sum = n * (n+1) / 2; // getting n natural sum

        for (int i : arr){
            sum-= i;    // subtracting nums of array from the totalsum
        }
        return sum; // here we are left with the remaining
    }
}
