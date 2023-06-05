package Treemap;

import java.util.TreeMap;

public class Practice1 {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> tm = new TreeMap<>();

        int arr [] = {3,5,2,4,5,2,3,7};

        for (int i : arr){
            tm.put(i, tm.getOrDefault(i, 0)+1);
        }

        // System.out.println(tm);

        for (Integer i : tm.keySet()){
            System.out.println(i+"-->"+tm.get(i));
        }
    }
}
