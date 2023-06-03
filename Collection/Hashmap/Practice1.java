package Hashmap;

import java.util.HashMap;

public class Practice1 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        int arr [] = {3,1,4,3,4,8,5};

        for (int i : arr){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }

        hm.forEach((k,v) -> System.out.println(k+" --> "+v));
    }
}
