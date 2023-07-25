import java.util.Arrays;
import java.util.HashMap;

public class MissingNumber {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,5};

        findMissingNumberBrutreForce(arr);
    }

    public static void findMissingNumberBrutreForce(int arr []){
        int nums [] = new int [arr.length];

        for (int i=0; i<arr.length; i++){
            nums[i] = i+1;
        }

        // System.out.println(Arrays.toString(nums));

        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i : arr){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }

        for (int i : nums){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }

        for (Integer i : hm.keySet()){
            if (hm.get(i) == 1){
                System.out.println("Given array is : " + Arrays.toString(arr));
                System.out.println("Missing number is : " + i);
                return;
            }
        }
    }
}
