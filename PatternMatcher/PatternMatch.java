// package PatternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch{
    public static void main(String[] args) {
        
        // Pattern pattern = Pattern.compile("hi there");
        // Pattern pattern = Pattern.compile("[aeiou]");
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher("1");

        if (matcher.matches()){
            System.out.println("Matches");
        }else {
            System.out.println("Invalid input");
        }

        checkWithWords();
        System.out.println("===========");
        checkWithDigits();
    }

    public static void checkWithWords(){
        String text = "Hi there how are you";

        //+ sign is used when we check whole sentence or words
        Pattern pattern = Pattern.compile("[a-z]+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}