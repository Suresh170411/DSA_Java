public class CheckPalindrome {
    public static void main(String[] args) {
        String name = "naman";
        
        if (checkPalindrome(name)){
            System.out.println(name + " name is Palindrome !");
        }else {
            System.out.println(name + " name is not a Palindrome !");
        }

        checkPalidndromeBruteForce(name);
    }

    public static boolean checkPalindrome(String str){

        int left = 0;
        int right = str.length()-1;

        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void checkPalidndromeBruteForce(String str){

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        if (str.equals(sb.toString())){
            System.out.println("PALINDROME");
        }else {
            System.out.println("NOT PALINDROME");
        }
    }
}
