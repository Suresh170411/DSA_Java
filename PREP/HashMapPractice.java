import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        int arr [] = {3,25,1,6,8,9,12,9,3,1};

        printFreq(arr);
        printHM(arr);
    }

    /**
     * The function takes an integer array as input and prints the frequency of each element in the
     * array.
     * 
     * @param arr an integer array that contains the elements for which you want to find the frequency
     * of occurrence.
     */
    public static void printFreq(int arr []){
        Map<Integer,Integer> hm = new HashMap<>();

        for (int i : arr){
            if (hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }else {
                hm.put(i, 1);
            }
        }
        
        for (Map.Entry<Integer,Integer> e : hm.entrySet()){
            System.out.println(e.getKey() +"=="+e.getValue());
        }
    }
    /**
     * The function takes an integer array as input, creates a HashMap to store the frequency of each
     * element in the array, and then prints out the elements and their frequencies.
     * 
     * @param arr an integer array that contains the elements to be counted and printed in the format
     * "element==count".
     */
    public static void printHM(int arr []){

        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i : arr){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }

        for (Integer i : hm.keySet()){
            System.out.println(i + "==" + hm.get(i));
        }
    }
}
