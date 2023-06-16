package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapPractice {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,3,4,7,2);

        List<Integer> result = numberOp(list);

        System.out.print("Result : ");
        result.forEach(s -> System.out.print(s+" "));
        System.out.println();
    }

    public static List<Integer> numberOp(List<Integer> list){
        return list.stream()
                    .map(n -> n*2)
                    .collect(Collectors.toList());
    }
}
