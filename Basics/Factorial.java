public class Factorial {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(findFactorial(n));
        System.out.println(printFact(n));
    }

    public static int findFactorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }

        return n * findFactorial(n-1);
    }

    public static int printFact(int n){
        
        if (n == 0){
            return 0;
        }

        int res = 1;

        for (int i=1; i<=n; i++){
            res = res*i;
        }

        return res;
    }
}
