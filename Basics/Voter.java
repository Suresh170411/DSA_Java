import java.util.Scanner;

public class Voter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if (age >= 18){
            System.out.println("Yes you are eligible for voting as your age is " + age);
        }else {
            System.out.println("You must be older than 18 years!");
        }
    }
}
