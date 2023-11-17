package persone;

public class DipendenteScolastico extends Persona {
    private double stipendio;

    public DipendenteScolastico(String nome, String cognome, int eta, String dataNascita, String luogoNascita, String sesso, double stipendio) {
        super(nome, cognome, eta, dataNascita, luogoNascita, sesso);
        this.stipendio = stipendio;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    @Override
    public String toString() {
        return "Dipendente Scolastico: " + super.toString() +
                "Stipendio: " + stipendio + "€" +  "\n";
    }
}
