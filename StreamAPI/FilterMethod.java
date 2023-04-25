package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// intermediate method
public class FilterMethod {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(10, "Suresh", 430));
        students.add(new Student(20, "Priti", 540));
        students.add(new Student(30, "Saumya", 240));
        students.add(new Student(40, "Pradeep", 450));
        students.add(new Student(50, "Chiku", 520));

        /** 
        Stream<Student> stream = students.stream();
        Stream<Student> filtered = stream.filter(s -> s.getMarks() > 500);

        filtered.forEach(s -> {
            System.out.println("ROLL : " + s.getRoll());
            System.out.println("NAME : " + s.getName());
            System.out.println("MARK : " + s.getMarks());
            System.out.println("=============");
        });
        */

        // it has been stored in another List
        students.stream()
        .filter(s->s.getMarks() > 500)
        .collect(Collectors.toList())
        .forEach(s ->{
            System.out.println("ROLL : " + s.getRoll());
            System.out.println("NAME : " + s.getName());
            System.out.println("MARK : " + s.getMarks());
            System.out.println("=============");
        });

        
    }
}
