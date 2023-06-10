package Hashmap;

import java.util.*;
import java.util.Map.Entry;

public class HashMapSort {
    public static void main(String[] args) {
        HashMap<String,Student> hm = new HashMap<>();

        hm.put("Odisha", new Student(10, "Suresh", 350));
        hm.put("Delhi", new Student(20, "Saurav", 450));
        hm.put("Bengaluru", new Student(30, "Ritesh", 490));
        hm.put("Kolkata", new Student(40, "Abhishek", 250));

        sortHashMap(hm);
    }

    public static void sortHashMap(HashMap<String,Student> hm){
        List<Entry<String,Student>> list = new ArrayList<>(hm.entrySet());

        Collections.sort(list, (l1,l2)-> l1.getValue().getMarks() > l2.getValue().getMarks() ? +1 : -1);

        for (Entry<String,Student> s : list){
            System.out.println("City : " + s.getKey());
            System.out.println("---------------------");
            Student student = s.getValue();
            
            System.out.println("Name : "+ student.getName());
            System.out.println("Roll : " + student.getRoll());
            System.out.println("Mark : " + student.getMarks());

            System.out.println("=====================");
        }
    }
}
