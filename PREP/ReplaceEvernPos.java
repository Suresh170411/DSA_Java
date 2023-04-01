public class ReplaceEvernPos {
    public static void main(String[] args) {
        String str = "suresh";
        replaceEvenPlaceByStar(str);
    }
    public static void replaceEvenPlaceByStar(String str){

        String bag = "";

        for (int i=0; i<str.length(); i++){
            if (i%2 == 1){
                bag+= str.charAt(i);
            }else {
                bag+= "*";
            }
        }
        System.out.println(bag);
    }
}
