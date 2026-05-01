package com.example;

import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        if (b != 0) {
            int result = a / b;
            logger.info("Result: " + result);
        } else {
            logger.warning("Cannot divide by zero");
        }
    }
}
