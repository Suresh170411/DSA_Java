public class Palindrome{
    public static void main(String[] args) {
        int num = 121;

        checkPalindrome(num);
    }

    public static void checkPalindrome(int num){
        String str1 = String.valueOf(num);

        String res = new StringBuilder(str1).reverse().toString();

        boolean check = str1.equals(res);

        System.out.println(check);
    }
}