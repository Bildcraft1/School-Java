import persone.Docente;
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

    public void aggiungiDipedente(Persona d) {
        aggiungiPersona(d);
    }

    @Override
    public String toString() {
        return "Scuola{" +
                "persone=" + Arrays.toString(persone) +
                '}';
    }


    public void ricercaPerNome(String nome) {
        for (int i = 0; i < numeroPersone; i++) {
            if (persone[i].getNome().equals(nome)) {
                System.out.println(persone[i]);
            }
        }
    }

    public void ricercaPerTipo(String tipo) {
        for(int i = 0; i < numeroPersone; i++) {
            if(persone[i].getClass().getSimpleName().equals(tipo)) {
                System.out.println(persone[i]);
            }
        }

    }

    public void ricercaPerClasse() {
    }

    public void ricercaPerMateria(String materia) {
        for(int i = 0; i < numeroPersone; i++) {
            if(persone[i].getClass().getSimpleName().equals("Docente")) {
                if(((Docente) persone[i]).getMateria().equals(materia)) {
                    System.out.println(persone[i]);
                }
            }
        }

    }

    public boolean visualizzaPersona(int pos) {
        if (pos != -1) {
            System.out.println(persone[pos]);
            return true;
        } else {
            return false;
        }
    }
}
