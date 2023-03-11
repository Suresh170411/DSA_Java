public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "ehkki";
        System.out.println(checkPalindrome(str));
    }

    // optimized two pointers approach for checking palindrome
    public static boolean checkPalindrome(String str){
        int left = 0;
        int right = str.length()-1;

        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }else {
                left++;
                right--;
            }
        }
        return true;
    }

    // brute force approach for checking palindrome
    public static boolean checkForPalindromeBF(String str){
        String container = "";
        for (int i=str.length()-1; i>=0; i--){
            container+= str.charAt(i);
        }
        if (container.equals(str)){
            return true;
        }else {
            return false;
        }
    }
}
