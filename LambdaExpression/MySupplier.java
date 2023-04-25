import java.util.function.Supplier;

public class MySupplier implements Supplier<String> {

    @Override
    public String get() {
        return "From get method of supplier";
    }
    
}
