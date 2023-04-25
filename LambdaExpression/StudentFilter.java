import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StudentFilter {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(10, "Suresh", 520));
        students.add(new Student(20, "Priti", 420));
        students.add(new Student(30, "Saumya", 560));
        students.add(new Student(40, "Pradeep", 380));
        students.add(new Student(50, "Ganesh", 510));
        students.add(new Student(60, "Lokesh", 490));


        // public boolean removeIf(Predicate filter);
        /**
         * class MyPredicate implements Predicate<Student>{
         *      
         *  @Override
         *  public boolean removeIf(Student s){
         *      return s.getMarks() > 500;
         *  }
         * }
         */
        
         // using external implemented class
        students.removeIf(new MyPredicate());

         /**
          * students.removeIf(s -> {
                return s.getMarks() > 500;
          });
          */
        students.removeIf(s -> s.getMarks() < 500);

        for (Student s : students){
            System.out.println(s);
        }

        // test method check --> public boolean test(Object obj);

        Predicate<Student> p = s -> s.getMarks() > 500;
        System.out.println(p.test(new Student(40, "Suresh", 540)));


        // USING CONSUMER ------------>

        // using external class
        Consumer<Student> c = new MyConsumer();
        c.accept(new Student(10, "Suresh", 400)); 

        System.out.println("=====================");

        // using LE
        Consumer<Student> le = s ->{
            System.out.println("Roll : " + s.getRoll());
            System.out.println("Name : " + s.getName());
            System.out.println("Mark : " + s.getMarks());
        };
        le.accept(new Student(20, "Priti", 500));
    }
}
