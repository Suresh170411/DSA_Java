public class SwapNumber{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swapNumUsingThirdVariable(a, b);
        System.out.println("\n");
        swapWithoutUsingThirdVar(a, b);
    }

    /**
     * Swapping the value of 2 numbers with the help of third variable
     * @param a initially it was 10 
     * @param b initially it was 20
     * 
     * But we create a third variable and store the value of a to variable temp which became temp = 10
     * After that we store the value of b to a which became a = 20
     * Then we assign value of b with the value of temp which became b = 10
     */
    public static void swapNumUsingThirdVariable(int a, int b){

        int temp = a;
        a = b;
        b = temp;

        System.out.println("value of a : " + a);
        System.out.println("value of b : " + b);
    }

    /**
     * Swapping two variables without using third varible
     * @param a initially it was 10
     * @param b initially it was 20
     * 
     * First in a vairable we store the sum of a+b. So a became a = 30
     * After that in b we store the value by using a-b. So it became b = 30-20 = 10
     * And finally we store value to a using a-b. So it became a = 30-10 = 20
     */
    public static void swapWithoutUsingThirdVar(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("value of a : " + a);
        System.out.println("value of b : " + b);
    }
}