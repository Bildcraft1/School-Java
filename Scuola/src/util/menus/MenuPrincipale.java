package util.menus;

import util.Input;

public class MenuPrincipale {

    public static void show() {
        System.out.println("1. Aggiungi Persona");
        System.out.println("2. Aggiungi Studente");
        System.out.println("3. Aggiungi Docente");
        System.out.println("4. Stampa Persone");
        System.out.println("5. Stampa Scuola");
        System.out.println("6. Menu ricerca");
        System.out.println("0. Esci");
    }

    public static int choice() {
        System.out.print("Scelta: ");
        return Input.getInt();
    }
}
