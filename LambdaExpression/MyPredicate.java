import java.util.function.Predicate;

// custom implemented class for Predicate
public class MyPredicate implements Predicate<Student>{

    @Override
    public boolean test(Student t) {
        return t.getMarks() < 500;
    }
    
}