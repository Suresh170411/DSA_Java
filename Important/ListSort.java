import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,4,5,1,8,5,9);
        sortList(list);

        List<Student> students = new ArrayList<>();

        students.add(new Student(10, "Suresh", 540));
        students.add(new Student(20, "Abhishek", 590));
        students.add(new Student(30, "Padma", 530));

        sortListCustomClass(students);
    }

    public static void sortList(List<Integer> list){
        Collections.sort(list);

        System.out.print("Sorted List is : ");
        for (Integer i : list){
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public static void sortListCustomClass(List<Student> list){
        Collections.sort(list, (s1,s2)-> s1.getMarks() > s2.getMarks() ? 1 : -1);

        for (Student s : list){
            System.out.println("Name : " + s.getName());
            System.out.println("Roll : " + s.getRoll());
            System.out.println("Marks : " + s.getMarks());

            System.out.println("-------------------");
        }
    }
}
