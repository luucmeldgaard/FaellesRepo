import java.util.Scanner;

public class ForLoops {

    public static void main(String[] args) {

        // for loop = executes a block of code a limited amount of times

        for(int i = 0; i<=10; i++) {
            System.out.println(i);
        }
        for(int i = 10; i>=0; i--) {
            System.out.println(i);
        }
        System.out.println("Happy New Year!");
        for(int i = 10; i>=0;) {
            System.out.println(i);
            i-=2; // You can also put the increment / decrement inside the for loop
        }

        // nested for loops
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        for(int i = 1; i<=rows; i++) {
            System.out.println();
            for(int j = 1; j<=columns; j++) {
                System.out.print(symbol);
            }
        }
    }
}
