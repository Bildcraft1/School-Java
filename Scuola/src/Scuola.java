import persone.Persona;
import persone.Studente;

import java.util.Arrays;

public class Scuola {
    private final Persona[] persone = new Persona[20];
    private static int numeroPersone;
    private String nome;

    public Scuola(String nome) {
        this.nome = nome;
    }

    public void aggiungiPersona(Persona p) {
        for (int i = 0; i < persone.length; i++) {
            if (persone[i] == null) {
                persone[i] = p;
                numeroPersone++;
                break;
            }
        }
    }

    public void aggiungiDocente(Persona p) {
        aggiungiPersona(p);
    }

    public void stampaPersone() {
        for (int i = 0; i < numeroPersone; i++) {
            System.out.println(persone[i]);
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
