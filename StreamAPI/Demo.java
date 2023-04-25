package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Balasore", "Bhubaneswar", "Pune", "Indore");

        // terminal method
        Stream<String> str1 = cities.stream();
        str1.forEach(s->System.out.println(s.toUpperCase()));

        // it will throw java.lang.IllegalStateException
        str1.forEach(s -> System.out.println(s)); // runtime exception
    }
}
