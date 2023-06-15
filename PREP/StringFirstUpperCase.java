import java.util.Arrays;

public class StringFirstUpperCase {
    public static void main(String[] args) {
        String str = "hello there how are you";

        String arr [] = str.split("\\s");   // [hello, there, how, are, you]

        System.out.println(Arrays.toString(arr));

        String bag = "";
        for (int i=0; i<arr.length; i++){
            String first = arr[i].substring(0, 1);
            String last = arr[i].substring(1);

            bag+= first.toUpperCase()+last + " ";
        }

        System.out.println(bag);
    }
}
