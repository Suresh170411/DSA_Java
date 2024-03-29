package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListPractice1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Balasore");
        list.add("Bhadrak");
        list.add("Soro");
        list.add("Cuttuck");

        
        // using enhanced for loop
        for (String s : list){
            System.out.println(s);
        }

        // using Iterator interface
        Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        // sort an arraylist
        Collections.sort(list);

        for (String s : list){
            System.out.println(s);
        }
    }
}
