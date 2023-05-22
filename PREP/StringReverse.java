
public class StringReverse {
    public static void main(String[] args) {
        String s = "hey.there.how.are.you";

        reverseStr(s);
    }

    public static void reverseStr(String str){
        // return null;

        String arr [] = str.split("[.]",0);

        // System.out.println(Arrays.toString(arr));

        String res = "";
        for (int i=arr.length-1; i>=0; i--){
            res+= arr[i]+".";
        }

        System.out.println(res.substring(0, res.length()-1));
    }
}
