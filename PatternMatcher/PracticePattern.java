import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticePattern {
    public static void main(String[] args) {
        checkWithDigits();
        checkWithoutDigits();
    }

    public static void checkWithDigits(){

        String input = "12345AABC";

        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.print(input.substring(matcher.start(), matcher.end()));
        }
        System.out.println();
    }

    public static void checkWithoutDigits(){
        String input = "1234Hello";

        Pattern patt = Pattern.compile("\\D");
        Matcher matcher = patt.matcher(input);

        while(matcher.find()){
            System.out.print(input.substring(matcher.start(), matcher.end()));
        }
        System.out.println();
    }
}


