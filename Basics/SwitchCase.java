public class SwitchCase {
    public static void main(String[] args) {
        
        int number = 4;
        checkNumber(number);

        String day = "Friday";
        checkWithDays(day);
        switchCaseUsingLE(day);
        
    }

    public static void checkNumber(int number){
        switch(number){
            case 1 : System.out.println("This is One");
            break;
            case 2 : System.out.println("This is Two");
            break;
            case 3 : System.out.println("This is Three");
            break;
            case 4 : System.out.println("This is Four");
            break;
            case 5 : System.out.println("This is Five");
            break;
            default : System.out.println("Please select a number between 1 to 5 !");
        }
    }

    public static void checkWithDays(String day){

        switch(day){
            case "Monday","Tuesday","Wednessday","Thursday","Friday","Saturday" : System.out.println("Please wake before 7 AM");
            break;
            
            case "Sunday" : System.out.println("Chill this is Sunday !");

            default : System.out.println("Please give a proper input");
        }
    }

    public static void switchCaseUsingLE(String day){
        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" -> System.out.println("Please wake before 7 AM");

            case "Sunday" -> System.out.println("Please take your time because this is Sunday!");

            default -> System.out.println("Please wake before 8 AM");
        }
    }
}
