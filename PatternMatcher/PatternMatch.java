// package PatternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch{
    public static void main(String[] args) {
        
        Pattern pattern = Pattern.compile("hi there"); 

        Matcher matcher = pattern.matcher("Hi There");

        if (matcher.matches()){
            System.out.println("Matches");
        }else {
            System.out.println("Invalid input");
        }
    }
}