import java.util.function.Function;

public class MyFunction implements Function<Student,String> {

    @Override
    public String apply(Student t) {
        return t.getMarks() > 500 ? "Pass" : "Fail";
    }
    
}
