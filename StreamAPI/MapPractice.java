package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapPractice {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,3,4,7,2);

        numberOp(list);

        List<String> cities = Arrays.asList("Balasore", "Goa", "Pune", "Indore");
        
        stringOp(cities);
        stringOperation(cities);
    }

    public static void numberOp(List<Integer> list){
        list.stream()
            .map(n -> n*2)
            .collect(Collectors.toList()).forEach(s -> System.out.print(s+" "));
        
        System.out.println();
        System.out.println("========================");
    }

    public static void stringOp(List<String> list){
        list.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList()).forEach(s-> System.out.print(s+" "));

        System.out.println();
        System.out.println("========================");
    }

    public static void stringOperation(List<String> list){
        list.stream()
        .map(s -> "stream_api->"+s)
        .collect(Collectors.toList())
        .forEach(s->System.out.print(s+" "));

        System.out.println();
    }
}
