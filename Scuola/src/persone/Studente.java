package persone;

public class Studente extends Persona{

    private String scuola;
    private int matricola;
    private static int studentiScuola;

    public Studente(String nome, String cognome, int eta, String dataNascita, String luogoNascita, String sesso, String scuola) {
        super(nome, cognome, eta, dataNascita, luogoNascita, sesso);
        this.scuola = scuola;
        this.matricola = ++studentiScuola;
    }

    @Override
    public String toString() {
        return "persone.Studente{" +
                "scuola='" + scuola + '\'' +
                ", matricola=" + matricola +
                "} " + super.toString();
    }

    public static void main(String[] args) {
        Studente s = new Studente("Andrea", "Moro", 17, "20/02/2006", "Udine", "M", "ITIS");
        System.out.println(s);
    }
}
