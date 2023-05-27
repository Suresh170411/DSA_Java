package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import StreamAPI.Student;

public class SortUsingComparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(10, "Suresh", 540));
        students.add(new Student(20, "Saumya", 520));
        students.add(new Student(30, "Priti", 590));

        /**
         * sort students using external implemented class
         */
        // Collections.sort(students, new ListSortComparator());  


        /**
         * sort students using inner class implementation
         */
        // Collections.sort(students, new Comparator<Student>() {

        //     @Override
        //     public int compare(Student o1, Student o2) {
        //         return o1.getMarks() > o2.getMarks() ? +1 : -1;
        //     }
            
        // });


        /**
         * sort students using Lambda Expression
         */
        Collections.sort(students, (s1,s2)-> s1.getMarks() > s2.getMarks() ? +1 : -1);

        for (Student s : students){
            System.out.println(s.getRoll()+" : "+s.getName()+" : "+s.getMarks());
        }
    }
}
