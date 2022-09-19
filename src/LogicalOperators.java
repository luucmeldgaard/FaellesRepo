import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args) {
        // Logical operators - used to connect two or more expressions
        //  && = (AND) both conditions must be true
        //  || = (OR) either condition must be true
        //  ! = (NOT) reverses boolean value of condition

        int temp = 26;

        if (temp > 30) {
            System.out.println("It is hot outside");
        }
        else if(temp>=15 && temp<=30)
            System.out.println("It is warm outside");
        else {
            System.out.println("It is cold outside");
        }

        Scanner scanner = new Scanner(System.in);



        while(true) {
            System.out.println("You are playing a game! Press q or Q to quit");
            String response = scanner.nextLine();
            if (response.equals("q") || response.equals("Q")) {
                System.out.println("Game is over - Thank you for playing!");
                break; }

        }

        System.out.println("Please don't say his name.. ");
        String name = scanner.nextLine();
        if(!name.equals("Voldemort")) {
            System.out.println("Thank you!");
        }
        else {
            System.out.println("YOU BITCH");
        }
    }
}
