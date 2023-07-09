import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticePattern {
    public static void main(String[] args) {
        checkWithDigits();
    }

    public static void checkWithDigits(){

        String input = "12345AABC";

        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.println(input.substring(matcher.start(), matcher.end()));
        }
    }
}


