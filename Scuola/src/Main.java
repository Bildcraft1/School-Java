import persone.Docente;
import persone.Persona;
import persone.Studente;
import util.Menu;

public class Main {
    public static void main(String[] args) {
        Scuola s = new Scuola("ITTS Volterra");
        Menu.show();

        int choice = Menu.choice();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    s.aggiungiPersona(Persona.creaPersona());
                    break;
                case 2:
                    s.aggiungiStudente(Studente.creaStudente());
                    break;
                case 3:
                    s.aggiungiDocente(Docente.creaDocente());
                    break;
                case 4:
                    s.stampaPersone();
                    break;
                case 5:
                    System.out.println(s);
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
            Menu.show();
            choice = Menu.choice();
        }
    }
}
