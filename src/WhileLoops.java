import java.util.Scanner;

public class WhileLoops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        name = "";

        do{
            System.out.println("Again!");
            name = scanner.nextLine();
        }while(name.isBlank());

        System.out.println("Hello " + name);
    }
}
