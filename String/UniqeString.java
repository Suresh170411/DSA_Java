import java.util.HashMap;

public class UniqeString {

    public static void main(String[] args) {
        String str = "masai";
        boolean res = uniqueStrCheck(str);
        if (res){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
    // unique string check method
    public static boolean uniqueStrCheck(String str){

        HashMap<Character,Integer> hm = new HashMap<>();

        for (char c : str.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        for (Character c : hm.keySet()){
            if (hm.get(c) > 1){
                return false;
            }
        }
        return true;
    }
}
