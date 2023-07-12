public class Palindrome{
    public static void main(String[] args) {
        int num = 121;

        checkPalindrome(num);
    }

    /**
     * The function checks if a given number is a palindrome or not.
     * 
     * @param num The parameter "num" is an integer that represents the number to be checked for
     * palindrome.
     */
    public static void checkPalindrome(int num){
        String str1 = String.valueOf(num);

        String res = new StringBuilder(str1).reverse().toString();

        boolean check = str1.equals(res);

        System.out.println(check);
    }
}