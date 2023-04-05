public class PrintSumOfNnaturalNum {
    public static void main(String[] args) {
        int n = 3;
        
        printSumOfNnaturalNumbers(1, n, 0);
    }   

    public static void printSumOfNnaturalNumbers(int start, int end, int sum){
        
        if (start == end){
            sum+= start;
            System.out.println(sum);
            return;
        }

        sum+= start;
        printSumOfNnaturalNumbers(start+1, end, sum);
    }
}
