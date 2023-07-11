import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticePattern {
    public static void main(String[] args) {
        checkWithDigits();
        checkWithoutDigits();
        checkWhiteSpace();
    }

    /**
     * The function checks a given string for any digits and prints them out.
     */
    public static void checkWithDigits(){

        String input = "12345AABC";

        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.print(input.substring(matcher.start(), matcher.end()));
        }
        System.out.println();
    }

    /**
     * The function checks a given string and prints all non-digit characters.
     */
    public static void checkWithoutDigits(){
        String input = "1234Hello";

        Pattern patt = Pattern.compile("\\D");
        Matcher matcher = patt.matcher(input);

        while(matcher.find()){
            System.out.print(input.substring(matcher.start(), matcher.end()));
        }
        System.out.println();
    }

    /**
     * The function checks the number of white spaces in a given string.
     */
    public static void checkWhiteSpace(){
        String input = "Hello There how are you?";

        Pattern patt = Pattern.compile("\s");
        Matcher matcher = patt.matcher(input);

        int count = 0;

        while(matcher.find()){
            count++;
        }
        System.out.println("White space is there for " + count + " times");
    }
}


