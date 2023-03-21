public class CountSpecialChar{
    public static void main(String[] args) {

        String str = "@ghf s%*e&";

        System.out.println(countSpecialChar(str));
        System.out.println(getTheSpecialChar(str));
    }

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