import persone.Persona;
import persone.Studente;

public class Main {
    public static void main(String[] args) {
        Scuola s = new Scuola();
        s.aggiungiPersona(new Persona("Andrea", "Moro Detto Rocco", 17, "20/02/2006", "Udine", "M"));
        s.aggiungiStudente(new Studente("Luca", "Bianchi", 20, "01/01/2000", "Udine", "M", "4A"));

        System.out.println(s);
    }
}
