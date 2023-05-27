package Arraylist;

import java.util.Comparator;

import StreamAPI.Student;

public class ListSortComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMarks() > o2.getMarks() ? +1 : -1;
    }
    
}
