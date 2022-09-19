import java.util.Scanner;

public class MathEssential {

    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);
        double a = Math.abs(y);
        double b = Math.sqrt(10);
        double c = Math.round(4.3);
        double d = Math.ceil(4.3);


        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // Find the hypotenuse of a right-angled triangle
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the length of side a: ");
        int sideA = scanner.nextInt();
        System.out.println("Please input the length of side b: ");
        int sideB = scanner.nextInt();

        double hypotenuse = Math.sqrt((sideA*sideA) + (sideB*sideB));
        System.out.println("Side A: " + sideA + "\n" + "Side B: " + sideB);
        System.out.println("Hypotenuse: " + hypotenuse);

        scanner.close(); //Always good practice
    }

}