import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class SortHashMapByValue {
    public static void main(String[] args) {
        
        HashMap<String,Student> hm = new HashMap<>();

        hm.put("Odisha", new Student(10, "Suresh", 540));
        hm.put("Kolkata", new Student(20, "Abhishek", 590));
        hm.put("Mumbai", new Student(30, "Padma", 530));

        sorthashMapUsingValue(hm);
    }

    /**
     * The function sorts a HashMap of Student objects based on their marks and prints the details of
     * each student in ascending order of marks.
     * 
     * @param hm The parameter "hm" is a HashMap with String keys and Student values.
     */
    public static void sorthashMapUsingValue(HashMap<String,Student> hm){
        List<Entry<String,Student>> list = new ArrayList<>(hm.entrySet());

        Collections.sort(list,(l1,l2)-> l1.getValue().getMarks() > l2.getValue().getMarks() ? 1 : -1);

        for (Entry<String,Student> s : list){
            System.out.println(s.getKey());
            System.out.println("----------------");

            Student st = s.getValue();
            System.out.println("Roll : " + st.getRoll());
            System.out.println("Name : " + st.getName());
            System.out.println("Marks : " + st.getMarks());

            System.out.println("================");
        }
    }
}
