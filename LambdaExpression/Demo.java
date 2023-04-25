import java.util.function.Supplier;

public class Demo{
    public static void main(String[] args) {
        Supplier<String> s = new MySupplier();
        String str = s.get();
        System.out.println(str);

        // using LE to use Supplier
        Supplier<String> st = () -> "Supplier by LE";
        System.out.println(st.get());
    }
}