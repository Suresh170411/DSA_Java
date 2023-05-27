package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StreamAPI.Student;

public class SortUsingComparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(10, "Suresh", 540));
        students.add(new Student(20, "Saumya", 520));
        students.add(new Student(30, "Priti", 590));

        Collections.sort(students, new ListSortComparator());

        for (Student s : students){
            System.out.println(s.getRoll()+" : "+s.getName()+" : "+s.getMarks());
        }
    }
}
