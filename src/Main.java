public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        // Bug: Division by zero
        System.out.println("Result: " + (a / b));

        // Code smell: Unused variable
        int unused = 100;

        // Duplicate code
        if (a > 5) {
            System.out.println("A is greater than 5");
        }
        if (a > 5) {
            System.out.println("A is greater than 5");
        }
    }
}
