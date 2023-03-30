public class ReverseString{
    public static void main(String[] args) {
        System.out.println(reverseStr("hello"));
    }
    public static String reverseStr(String str){
        StringBuilder sb = new StringBuilder(str);

        return sb.reverse().toString();
    }
}