package com.example;

public class Main {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        // ✅ Correct condition (not always false)
        if (a > b) {
            // ✅ Proper formatting using String.format
            String message = String.format("a (%d) is greater than b (%d)", a, b);
            System.out.println(message);
        } else {
            String message = String.format("a (%d) is not greater than b (%d)", a, b);
            System.out.println(message);
        }
    }
}
