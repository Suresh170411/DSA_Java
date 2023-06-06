import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(2);
        set.add(2); // repeated element
        set.add(6);
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(4);

        set.forEach(s -> System.out.println(s));
        System.out.println("size of the set is : " + set.size());
    }
}
