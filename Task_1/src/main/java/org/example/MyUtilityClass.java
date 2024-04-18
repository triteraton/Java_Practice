package org.example;

public class MyUtilityClass {
    private static int counter = 0;

    public static void incrementCounter() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
