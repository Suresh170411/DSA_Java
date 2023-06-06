import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(3);
        set.add(4);
        set.add(6);
        set.add(2);
        set.add(2); // repeated element
        set.add(8);
        set.add(1);

        System.out.println(set);
    }
}
