import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForeachOrder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,2,6,8,3);

        forEachOp(list);
    }

    public static void forEachOp(List<Integer> list){
        Stream<Integer> res = list.stream();
            
        res.forEachOrdered(s->System.out.println(s));
    }
}
