import java.util.function.Consumer;

/**
 * The MyConsumer class is a Java implementation of the Consumer interface that prints the roll, name,
 * and marks of a Student object.
 */
public class MyConsumer implements Consumer<Student> {

    @Override
    public void accept(Student t) {
        
        System.out.println("Roll : " + t.getRoll());
        System.out.println("Name : " + t.getName());
        System.out.println("Mark : " + t.getMarks());
    }
    
}
