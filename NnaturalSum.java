public class NnaturalSum {
    public static void main(String[] args) {
        NnaturalSum demo = new NnaturalSum();

        double now = System.currentTimeMillis();

        System.out.println(demo.findSum(99999));
        // System.out.println(demo.findSumItr(99999));

        System.out.println("Time taken - "+ (System.currentTimeMillis()-now) + " ms"); // getting the time taken for the algo in miliseconds
    }

    // cmparatively faster than iterative approach
    public int findSum(int n){
        return n * (n+1)/2;
    }

    // iterative solution for finding n natural number sum
    public int findSumItr(int n){
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum+= i;
        }
        return sum;
    }
}
