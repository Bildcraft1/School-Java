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

    public static char getChar() {
        String temp = scanner.nextLine();
        char x;
        try {
            x = temp.charAt(0);
        } catch (StringIndexOutOfBoundsException e) {
            x = ' ';
        }

        return x;
    }

    public static String getLine() {
        return scanner.nextLine();
    }

    public static String[] getGeneralInfo() {
        System.out.println("Inserisci nome: ");
        String nome = Input.getString();
        System.out.println("Inserisci cognome: ");
        String cognome = Input.getString();

        int eta = 0;
        do {
            System.out.println("Inserisci età: ");
            eta = Input.getInt();
            if(eta < 0) {
                System.out.println("Età non valida");
            }
        } while (eta <= 1);

        System.out.println("Inserisci data di nascita  (Formato GG/MM/YYYY): ");
        String dataNascita = Input.getString();
        System.out.println("Inserisci luogo di nascita: ");
        String luogoNascita = Input.getString();
        System.out.println("Inserisci sesso (M/F): ");
        String sesso = Input.getString();

        while (sesso.toLowerCase().charAt(0) != 'm' || sesso.toLowerCase().charAt(0) != 'f') {
            System.out.println("Sesso non valido");
            System.out.println("Inserisci sesso (M/F): ");
            sesso = Input.getString();
        }

        return new String[]{nome, cognome, Integer.toString(eta), dataNascita, luogoNascita, sesso};
    }

    public static String getString() {
        return scanner.nextLine();
    }
}
