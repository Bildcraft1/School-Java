import persone.Docente;
import persone.Persona;
import util.Menu;

public class Main {
    public static void main(String[] args) {
        Scuola s = new Scuola();
        Menu.show();

        int choice = Menu.choice();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    s.aggiungiPersona(Persona.creaPersona());
                    break;
                case 2:
                    s.addStudente();
                    break;
                case 3:
                    s.addDocente(Docente.creaDocente());
                    break;
                case 4:
                    s.stampaPersone();
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
            Menu.show();
            choice = Menu.choice();
        }
    }
}
