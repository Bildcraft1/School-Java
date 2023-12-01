package persone;

import util.Input;

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

    /**
     * Crea un dipendente scolastico
     *
     * @return Dipendente scolastico creato
     */
    public static DipendenteScolastico creaDipendenteScolastico() {
        String[] dati = Input.getGeneralInfo();
        System.out.println("Inserisci stipendio: ");
        double stipendio = Input.getDouble();
        return new DipendenteScolastico(dati[0], dati[1], Integer.parseInt(dati[2]), dati[3], dati[4], dati[5], stipendio);
    }

    @Override
    public String toString() {
        return "Dipendente Scolastico: " + super.toString() +
                "Stipendio: " + stipendio + "€" +  "\n";
    }

    public static void main(String[] args) {
        DipendenteScolastico d = new DipendenteScolastico("Luca", "Bianchi", 20, "01/01/2000", "Udine", "M", 1000);
        DipendenteScolastico d1 = creaDipendenteScolastico();
        System.out.println(d);
        System.out.println(d1);
    }
}
