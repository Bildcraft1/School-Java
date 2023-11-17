package util;

public class Menu {

    public static void show() {
        System.out.println("1. Aggiungi Persona");
        System.out.println("2. Aggiungi Studente");
        System.out.println("3. Aggiungi Docente");
    }

    public static int choice() {
        System.out.print("Scelta: ");
        return Input.getInt();
    }
}
