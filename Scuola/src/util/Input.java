package util;

import java.util.Scanner;

public class Input {

    private final static Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        String temp = scanner.nextLine();
        int x;
        try {
            x = Integer.parseInt(temp);
        } catch (NumberFormatException e) {
            x = -128;
        }

        return x;
    }

    public static double getDouble() {
        String temp = scanner.nextLine();
        double x;
        try {
            x = Double.parseDouble(temp);
        } catch (NumberFormatException e) {
            x = -128;
        }

        return x;
    }

    public static String getString() {
        return scanner.nextLine();
    }
}
