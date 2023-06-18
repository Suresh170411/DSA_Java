import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForeachOrder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,2,6,8,3);

        forEachOp(list);
    }

    /**
     * The function takes a list of integers and prints each element in the list in order using a
     * stream.
     * 
     * @param list The parameter "list" is a List of Integer values that is passed as an argument to
     * the method "forEachOp".
     */
    public static void forEachOp(List<Integer> list){
        Stream<Integer> res = list.stream();
            
        res.forEachOrdered(s->System.out.println(s));
    }
}
