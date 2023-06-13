import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,5,1,8,5,9);
        sortList(list);

        List<Student> students = new ArrayList<>();

        students.add();
    }

    public static void sortList(List<Integer> list){
        Collections.sort(list);

        for (Integer i : list){
            System.out.println(i);
        }
    }

    public static void sortListCustomClass(List<Student> list){
        Collections.sort(list, (s1,s2)-> s1.getMarks() > s2.getMarks() ? 1 : -1);

        for (Student s : list){
            System.out.println(s);
        }
    }
}
