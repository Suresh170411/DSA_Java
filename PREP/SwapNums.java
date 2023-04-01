public class SwapNums {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        swapNumbersWithoutThirdVar(x, y);
    }
    public static void swapNumbersWithoutThirdVar(int x, int y){

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println(x +" "+ y);
    }
}
