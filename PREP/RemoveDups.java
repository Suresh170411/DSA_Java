import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDups {
    public static void main(String[] args) {
        int arr [] = {1,2,2,3,4,4,5,8,9};
        
        removeDuplicates(arr);
    }

    public static void removeDuplicates(int [] arr) {
        
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int i : arr){
            set.add(i);
        }

        int [] res = new int [set.size()];
        int index = 0;

        for (Integer i : set){
            res[index++] = i;
        }
        System.out.println(Arrays.toString(res));
    }
}
