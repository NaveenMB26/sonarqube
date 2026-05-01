import java.util.logging.Logger;

public class Main {

    // Create Logger instance
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        // Replace System.out.println with logger
        logger.info("Application started");

        int a = 10;
        int b = 20;

        int sum = a + b;

        logger.info("Sum is: " + sum);

        logger.info("Application finished");
    }
}
