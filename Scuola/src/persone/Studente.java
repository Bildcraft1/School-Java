package persone;

import util.Input;

public class Studente extends Persona {

    private String scuola, classe;
    private int matricola;
    private static int studentiScuola;


    /**
     * Crea uno studente
     *
     * @param nome         Nome
     * @param cognome      Cognome
     * @param eta          Età
     * @param dataNascita  Data di nascita (Formato GG/MM/YYYY)
     * @param luogoNascita Luogo di nascita (controllare gli ENUM per vedere se fa parte)
     * @param sesso        Sesso (M/F)
     * @param scuola       Scuola
     * @param classe       Classe
     */
    public Studente(String nome, String cognome, int eta, String dataNascita, String luogoNascita, String sesso, String scuola, String classe) {
        super(nome, cognome, eta, dataNascita, luogoNascita, sesso);
        this.scuola = scuola;
        this.classe = classe;
        this.matricola = ++studentiScuola;
    }

    /**
     * Crea uno studente chiedendo i dati all'utente
     *
     * @return Studente creato
     */
    public static Studente creaStudente() {
        String[] dati = Input.getGeneralInfo();
        System.out.println("Inserisci scuola: ");
        String scuola = Input.getString();
        System.out.println("Inserisci classe: ");
        String classe = Input.getString();
        assert dati != null;
        return new Studente(dati[0], dati[1], Integer.parseInt(dati[2]), dati[3], dati[4], dati[5], scuola, classe);
    }

    @Override
    public String toString() {
        return "Studente: " + super.toString() +
                "Scuola: " + scuola + "\n" +
                "Classe: " + classe + "\n" +
                "Matricola: " + matricola + "\n";
    }

    public static void main(String[] args) {
        Studente s = new Studente("Luca", "Bianchi", 20, "01/01/2000", "Udine", "M", "OTIS", "4A");
        System.out.println(s);
    }
}
