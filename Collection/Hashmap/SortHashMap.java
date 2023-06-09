package Hashmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SortHashMap {
    public static void main(String[] args) {
        HashMap<String,Student> hm = new HashMap<>();

        hm.put("Odisha", new Student(10, "Suresh", 350));
        hm.put("Delhi", new Student(20, "Saurav", 450));
        hm.put("Bengaluru", new Student(30, "Ritesh", 490));
        hm.put("Kolkata", new Student(40, "Abhishek", 250));

        print(hm);

        sortHashMapByValue(hm);
    }

    /**
     * Taken Comparator and added into Set
     * Then using TreeSet added all the set elements
     * @param hm
     */
    public static void sortHashMapByValue(HashMap<String,Student> hm){
        Comparator<Map.Entry<String,Student>> comp = (s1,s2)->{
            return s1.getValue().getMarks() > s2.getValue().getMarks() ? +1 : -1;
        };

        Set<Map.Entry<String,Student>> set = hm.entrySet();
        
        Set<Map.Entry<String,Student>> treeSet = new TreeSet<>(comp);
        treeSet.addAll(set);

        for (Map.Entry<String,Student> s : treeSet){
            System.out.println(s);
        }
    }

    public static void print(HashMap<String,Student> hm){
        
        for (String s : hm.keySet()){
            System.out.println(s+":");
            System.out.print(hm.get(s).getRoll() +" "+ hm.get(s).getName() +" "+ hm.get(s).getMarks());
            System.out.println();
        }
    }

    public static void sortUsingLE(HashMap<String,Student> hm){
        
    }
}
