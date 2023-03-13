import java.util.HashMap;

public class UniqeString {

    public static void main(String[] args) {
        String str = "masai";
        boolean res = stackPractice(str);
        if (res){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
    public static boolean stackPractice(String str){

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
