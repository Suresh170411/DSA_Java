package Important;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(digitSum(32));
    }

    // 32 --> 3+2 = 5
    public static int digitSum(int n){
        int sum = 0;

        while (n > 0){
            sum+= n%10;
            n = n/10;
        }
        return sum;
    }
}
