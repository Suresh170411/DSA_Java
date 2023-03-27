package StarPrinting;

public class Problem1 {
    public static void main(String[] args) {
        
        printStars(5, 4);
        printChars(5, 4);
        
    }
    public static void printStars(int row, int column){
        for (int i=1; i<=row; i++){
            for (int j=1; j<=column; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void printChars(int row, int column){
        String str = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;
        for (int i=1; i<=row; i++){
            for (int j=1; j<=column; j++){
                System.out.print(str.charAt(count)+" ");
                count++;
            }
            System.out.println();
        }
    }
}
