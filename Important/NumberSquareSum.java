package Important;
public class NumberSquareSum {
    public static void main(String[] args) {
        System.out.println(numberSquareSum(19));
    }

    // 19 --> 1 - 9
    // 1^2 + 9^2 = 82

    public static int numberSquareSum(int n){
        int sum = 0;
        while (n > 0){
            sum+= (n%10)*(n%10);
            n = n/10;
        }
        return sum;
    }
}
