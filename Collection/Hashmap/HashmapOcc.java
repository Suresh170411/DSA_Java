package Hashmap;

import java.util.HashMap;

public class HashmapOcc {
    public static void main(String[] args) {
        String str = "aaccbbdee";

        printMinChar(str);
    }

    public static void printMinChar(String str){
        HashMap<Character,Integer> hm = new HashMap<>();

        for (Character c : str.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }

        int min = Integer.MAX_VALUE;

        for (Character c : hm.keySet()){
            if (hm.get(c) < min){
                min = hm.get(c);
            }
        }

        for (Character c : hm.keySet()){
            if (hm.get(c) == min){
                System.out.println("Minimum occured character is : " + c);
            }
        }
}


