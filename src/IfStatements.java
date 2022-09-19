import java.util.Scanner;

public class IfStatements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");

        int age = scanner.nextInt();

        if(age == 0) {
            System.out.println("Java developers gotta start young!");
        }
        else if(age == 150) {
            System.out.println("That's a lie!!");
        }
        else if(age >= 18) {
            System.out.println("You are an adult!");
        }
        else {
            System.out.println("You are not an adult!");
        }

    }

}
