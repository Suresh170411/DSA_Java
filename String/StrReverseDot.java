import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StrReverseDot {
    public static void main(String[] args) {
        
        String str = "hello.there.how.are.you";
        stringReverseWithDots(str);

        reverseStrWithCollection(str);

        String words = "hello there how are you";
        reverseStrWithSpace(words);

        String num = "8955";
        parseIntCheck(num);
    }

    /**
     * The function takes a string as input, splits it by dots, reverses the order of the resulting
     * array, and concatenates the elements with dots in reverse order.
     * 
     * @param str The input string that needs to be reversed with dots.
     */
    public static void stringReverseWithDots(String str){
        String arr [] = str.split("[.]",0);

        String res = "";
        for (int i=arr.length-1; i>=0; i--){
            res+= arr[i]+".";
        }

        System.out.println(res.substring(0, res.length()-1));
        //System.out.println(res); --> this will print one (.) at the end as well
    }

    /**
     * The function takes a string as input, splits it into an array of words separated by spaces,
     * reverses the order of the words, and returns the reversed string with spaces.
     * 
     * @param str The input string that needs to be reversed with spaces preserved between the words.
     */
    public static void reverseStrWithSpace(String str){
        String arr [] = str.split(" ");

        String res = "";
        for (int i=arr.length-1; i>=0; i--){
            res+= arr[i]+" ";
        }

        System.out.println(res.substring(0, res.length()-1));
    }

    public static void parseIntCheck(String num){
        System.out.println(Integer.parseInt(num));
    }

    public static void reverseStrWithCollection(String str){
        String arr [] = str.split("[.]",0);

        List<String> list = new ArrayList<>();

        for (String s : arr){
            list.add(s);
        }

        Collections.reverse(list);

        System.out.print("From Collection : ");
        for (String s : list){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
