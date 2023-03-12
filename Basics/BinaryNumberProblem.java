import java.util.Arrays;

public class BinaryNumberProblem {
    public static void main(String[] args) {
        String str = "010101";

        int arr [] =  Arrays
                        .stream(str.split(""))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        System.out.println(Arrays.toString(arr));
    }
}
