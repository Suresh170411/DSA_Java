import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapPractice{
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Balasore","Bhubaneswar","Khorda","Cuttuck");

        flatMapDemo(cities);
        mapDemo(cities);
    }

    public static void flatMapDemo(List<String> list){
        list.stream()
            .flatMap(s -> Stream.of(s.charAt(0)))
            .forEach(s -> System.out.println(s));
    }

    public static void mapDemo(List<String> list){
        list.stream()
            .map(s -> s.charAt(0))
            .forEach(s->System.out.println(s));
    }
}