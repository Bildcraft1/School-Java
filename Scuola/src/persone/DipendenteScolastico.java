package persone;

public class DipendenteScolastico extends Persona {
    private double stipendio;

    public DipendenteScolastico(String nome, String cognome, int eta, String dataNascita, String luogoNascita, String sesso, double stipendio) {
        super(nome, cognome, eta, dataNascita, luogoNascita, sesso);
        this.stipendio = stipendio;
    }
}
