public class StringClass{
    public static void main(String[] args) {
     
        String word = "hello";

        System.out.println(word.codePointAt(2));

        System.out.println(word.compareTo("word"));

        System.out.println(word.concat(" Suresh"));
    }
}