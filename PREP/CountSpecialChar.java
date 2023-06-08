public class CountSpecialChar{
    public static void main(String[] args) {

        String str = "@ghf s%*e&";

        System.out.println(countSpecialChar(str));
        System.out.println(getTheSpecialChar(str));
    }

    /**
     * The function counts the number of special characters in a given string.
     * 
     * @param str The input string for which the number of special characters needs to be counted.
     * @return The method `countSpecialChar` returns an integer value which represents the count of
     * special characters in the input string `str`.
     */
    public static int countSpecialChar(String str){
        int n = str.length();
        int count = 0;
        for (int i=0; i<n; i++){
            char c = str.charAt(i);
            if (!Character.isDigit(c) && !Character.isLetter(c) && !Character.isWhitespace(c)){
                count++;
            }
        }
        return count;
    }

    public static String getTheSpecialChar(String str){
        int n = str.length();

        String res = "";

        for (int i=0; i<n; i++){
            char c = str.charAt(i);
            if (!Character.isDigit(c) && !Character.isLetter(c) && !Character.isWhitespace(c)){
                res+= c;
            }
        }
        return res;
    }
}