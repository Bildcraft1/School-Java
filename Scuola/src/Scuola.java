import persone.Persona;
import persone.Studente;

import java.util.Arrays;

public class Scuola {
    private Persona[] persone = new Persona[20];

    public void aggiungiPersona(Persona p) {
        for (int i = 0; i < persone.length; i++) {
            if (persone[i] == null) {
                persone[i] = p;
                break;
            }
        }
    }

    public void aggiungiStudente(Studente s) {
            aggiungiPersona(s);
    }

    @Override
    public String toString() {
        return "Scuola{" +
                "persone=" + Arrays.toString(persone) +
                '}';
    }
}
