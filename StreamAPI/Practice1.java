package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        list.stream()
            .filter(s-> s%2 ==0)
            .collect(Collectors.toList())
            .forEach(s-> System.out.println(s));

        
        getSum(list);
    }

    public static void getSum(List<Integer> list){
        int sum = list.stream()
                        .filter(s -> s%2 == 0)
                        .collect(Collectors.toList())
                        .stream()
                        .reduce(0, (a,b)-> a+b);

        System.out.println(sum);
    }
}
