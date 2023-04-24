import java.util.ArrayList;
import java.util.List;

public class StudentFilter {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(10, "Suresh", 520));
        students.add(new Student(20, "Priti", 420));
        students.add(new Student(30, "Saumya", 560));
        students.add(new Student(40, "Pradeep", 380));
        students.add(new Student(50, "Ganesh", 510));
        students.add(new Student(60, "Lokesh", 490));

        students.removeIf(s -> s.getMarks() < 500);

        for (Student s : students){
            System.out.println(s);
        }
    }
}
