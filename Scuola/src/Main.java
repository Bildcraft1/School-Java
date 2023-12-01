import persone.DipendenteScolastico;
import persone.Docente;
import persone.Studente;
import util.Input;
import util.menus.MenuPrincipale;
import util.menus.MenuRicerca;

public class Main {
    public static void main(String[] args) {
        Scuola s = new Scuola("ITTS Volterra");
        MenuPrincipale.show();

        int choice = MenuPrincipale.choice();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    s.aggiungiDipedente(DipendenteScolastico.creaDipendenteScolastico());
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
                case 6:
                    MenuRicerca.show();
                    int ricerca = MenuRicerca.choice();
                    switch (ricerca) {
                        case 1:
                            System.out.println("Inserisci il nome da cercare: ");
                            s.ricercaPerNome(Input.getString());
                            break;
                        case 2:
                            System.out.println("Inserisci il tipo da cercare: ");
                            s.ricercaPerTipo(Input.getString());
                            break;
                        case 3:
                            // Solo per studenti
                            s.ricercaPerClasse();
                            break;
                        case 4:
                            // Solo per docenti
                            System.out.println("Inserisci la materia da cercare: ");
                            s.ricercaPerMateria(Input.getString());
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Scelta non valida");
                    }
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
            MenuPrincipale.show();
            choice = MenuPrincipale.choice();
        }
    }
}
