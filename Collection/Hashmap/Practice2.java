package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Practice2 {
    public static void main(String[] args) {
        int arr [] = {2,1,4,3,5,4,3};

        printFreq(arr);
    }

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
}
