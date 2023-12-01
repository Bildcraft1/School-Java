package persone;

import util.Input;

/**
 * Classe che rappresenta un docente
 */
public class Docente extends DipendenteScolastico {
    private String materia;
    private int ore;

    public Docente(String nome, String cognome, int eta, String dataNascita, String luogoNascita, String sesso, double stipendio, String materia, int ore) {
        super(nome, cognome, eta, dataNascita, luogoNascita, sesso, stipendio);
        this.materia = materia;
        this.ore = ore;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getOre() {
        return ore;
    }

    public void setOre(int ore) {
        this.ore = ore;
    }


    /**
     * Crea un docente
     *
     * @return Docente creato
     */
    public static Docente creaDocente() {
        String[] dati = Input.getGeneralInfo();
        System.out.println("Inserisci stipendio: ");
        double stipendio = Input.getDouble();
        System.out.println("Inserisci materia: ");
        String materia = Input.getString();
        System.out.println("Inserisci ore: ");
        int ore = Input.getInt();
        return new Docente(dati[0], dati[1], Integer.parseInt(dati[2]), dati[3], dati[4], dati[5], stipendio, materia, ore);
    }


    /**
     * Stampa il docente
     *
     * @return Stringa contenente il docente
     */
    @Override
    public String toString() {
        return "Docente: " + super.toString() +
                "Materia: " + materia + "\n" +
                "Ore: " + ore + "\n";
    }


    /**
     * Metodo main usato per testing
     *
     * @param args
     */
    public static void main(String[] args) {
        Docente d = new Docente("Andrea", "Moro Detto Rocco", 17, "20/02/2006", "Udine", "M", 1000, "Informatica", 20);
        System.out.println(d.getClass().getName());

    }
}
