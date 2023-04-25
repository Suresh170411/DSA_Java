package StreamAPI;

/**
 * Here we will try to add additional 50 marks to all the student and collect them in 
 * another list.
 */
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class MapMethod {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(10, "Suresh", 430));
        students.add(new Student(20, "Priti", 540));
        students.add(new Student(30, "Saumya", 240));
        students.add(new Student(40, "Pradeep", 450));
        students.add(new Student(50, "Chiku", 520));

        // List<Student> mappedStudents = students
        //                                 .stream()
        //                                 .map(s -> new Student(s.getRoll(), s.getName(), s.getMarks()+50))
        //                                 .collect(Collectors.toList());
        
        // mappedStudents.forEach(s -> {
        //     System.out.println("ROLL : " + s.getRoll());
        //     System.out.println("NAME : " + s.getName());
        //     System.out.println("MARK : " + s.getMarks());
        //     System.out.println("=============");
        // });

        // giving 50 marks only them who has less than 500 marks
        List<Student> filterdMappedStudents =  students.stream()
        
        // .map(s -> {
        //     if (s.getMarks() < 500){
        //         return new Student();
        //     }else {
        //         return s;
        //     }
        // })

        .map(s -> s.getMarks() < 500 ? new Student(s.getRoll(), s.getName(), s.getMarks()+50) : s)
        .collect(Collectors.toList());

        filterdMappedStudents.forEach(s-> {
            System.out.println("ROLL : " + s.getRoll());
            System.out.println("NAME : " + s.getName());
            System.out.println("MARK : " + s.getMarks());
            System.out.println("=============");
        });
    }
}
