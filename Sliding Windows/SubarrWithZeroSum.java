import java.util.HashSet;

public class SubarrWithZeroSum{
    public static void main(String[] args) {
        int arr [] = {-3, 3, 2, 1, 6};

        System.out.println(checkMethod(arr));
    }

    public static boolean checkMethod(int arr []){
        int n = arr.length;

        HashSet<Integer> hs = new HashSet<>();

        int sum = 0;

        for (int i : arr){
            sum+= i;

            if (i == 0 || sum == 0 || hs.contains(sum)){
                return true;
            }
            hs.add(sum);
        }
        return false;
    }
}