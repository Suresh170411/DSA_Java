import java.util.function.Function;
import java.util.function.Supplier;

public class Demo{
    public static void main(String[] args) {

        //using external class
        Supplier<String> s = new MySupplier();
        String str = s.get();
        System.out.println(str);

        // using LE to use Supplier
        Supplier<String> st = () -> "Supplier by LE";
        System.out.println(st.get());

        // using user defined classes in Supplier
        Supplier<Student> student = () -> new Student(10, "Suresh", 300);

        System.out.println(student.get().getRoll());
        System.out.println(student.get().getName());
        System.out.println(student.get().getMarks());

        // Checking for Function Interface which is having only one method --> (apply)
        Function<Student,String> func = new MyFunction();

        String res = func.apply(new Student(20, "Suresh", 540));

        System.out.println(res);

    }
}