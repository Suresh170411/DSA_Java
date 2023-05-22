
public class StringReverse {
    public static void main(String[] args) {
        String s = "hey.there.how.are.you";

        reverseStr(s);
    }

    public static void reverseStr(String str){


        // `String arr [] = str.split("[.]",0);` is splitting the input string `str` into an array of
        // substrings using the delimiter "." (dot). The `0` in the `split` method specifies that there
        // should be no limit to the number of substrings that can be created. The resulting array
        // `arr` will contain all the substrings separated by dots.
        String arr [] = str.split("[.]",0);

        // System.out.println(Arrays.toString(arr));

        String res = "";
        for (int i=arr.length-1; i>=0; i--){
            res+= arr[i]+".";
        }

        // `System.out.println(res.substring(0, res.length()-1));` is printing the reversed string with
        // dots as delimiters. The `substring` method is used to remove the extra dot at the end of the
        // reversed string. `res.length()-1` is used to get the index of the last character in the
        // string, which is the extra dot. By passing this index as the second argument to the
        // `substring` method, the extra dot is excluded from the final output.
        System.out.println(res.substring(0, res.length()-1));
    }
}
