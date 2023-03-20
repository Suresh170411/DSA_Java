import java.util.HashMap;
import java.util.HashSet;

public class HashMapPractice2 {
    public static void main(String[] args) {
        
        int arr [] = {1,2,3,3,5};
        
        System.out.println(findMissing(arr));

        findRepeated(arr);

    }

    public static int findMissing(int arr []){
        
        HashSet<Integer> hs = new HashSet<>();

        for (int i : arr){
            hs.add(i);
        }

        int n = arr.length;
        
        int sum = n * (n+1) / 2;

        for (Integer i : hs){
            sum-= i;
        }

        return sum;
    }

    public static void findRepeated(int arr []){

        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i : arr){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        
        for (Integer i : hm.keySet()){
            if (hm.get(i) == 2){
                System.out.println(i);
            }
        }
    }
}
