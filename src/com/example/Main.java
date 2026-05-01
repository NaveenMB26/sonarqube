package com.example;

import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        logger.info("Application started");

        int a = 10;
        int b = 20;

        int sum = a + b;

        // ✅ Fixed (lazy evaluation)
        logger.info(() -> "Sum is: " + sum);

        logger.info("Application finished");
    }
}
