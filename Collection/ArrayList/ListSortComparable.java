package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortComparable implements Comparable<ListSortComparable> {

    int runs;
    String name;

    public ListSortComparable(){

    }

    public ListSortComparable(int runs, String name){
        this.runs = runs;
        this.name = name;
    }

    @Override
    public int compareTo(ListSortComparable o) {
       if (this.runs > o.runs) return 1;
       if (this.runs < o.runs) return -1;
       return 0;
    }
    
    public static void main(String[] args) {
        List<ListSortComparable> list = new ArrayList<>();

        list.add(new ListSortComparable(45, "Sachin"));
        list.add(new ListSortComparable(65, "Sehwag"));
        list.add(new ListSortComparable(60, "Subhman"));
        list.add(new ListSortComparable(72, "Pujara"));

        Collections.sort(list);

        for (ListSortComparable l : list){
            System.out.println(l.name +"--> "+ l.runs);
        }
    }
}
