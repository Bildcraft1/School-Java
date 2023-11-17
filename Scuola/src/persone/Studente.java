package persone;

public class Studente extends Persona{

    private String scuola, classe;
    private int matricola;
    private static int studentiScuola;

    public Studente(String nome, String cognome, int eta, String dataNascita, String luogoNascita, String sesso, String scuola, String classe) {
        super(nome, cognome, eta, dataNascita, luogoNascita, sesso);
        this.scuola = scuola;
        this.classe = classe;
        this.matricola = ++studentiScuola;
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
