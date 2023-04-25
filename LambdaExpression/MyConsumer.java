import java.util.function.Consumer;

public class MyConsumer implements Consumer<Student> {

    @Override
    public void accept(Student t) {
        
        System.out.println("Roll : " + t.getRoll());
        System.out.println("Name : " + t.getName());
        System.out.println("Mark : " + t.getMarks());
    }
    
}
