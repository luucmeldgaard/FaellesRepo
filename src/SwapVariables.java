public class SwapVariables {

    public static void main(String[] args) {

        String x = "Water";
        String y = "Coffee";
        String temp; // A temporary placeholder

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}
