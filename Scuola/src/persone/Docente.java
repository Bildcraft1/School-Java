package persone;

import util.Input;

import javax.print.Doc;

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

    public static Docente creaDocente() {
        System.out.println("Inserisci nome: ");
        String nome = Input.getString();
        System.out.println("Inserisci cognome: ");
        String cognome = Input.getString();
        System.out.println("Inserisci età: ");
        int eta = Input.getInt();
        System.out.println("Inserisci data di nascita  (Formato GG/MM/YYYY): ");
        String dataNascita = Input.getString();
        System.out.println("Inserisci luogo di nascita: ");
        String luogoNascita = Input.getString();
        System.out.println("Inserisci sesso (M/F): ");
        String sesso = Input.getString();
        System.out.println("Inserisci stipendio: ");
        double stipendio = Input.getDouble();
        System.out.println("Inserisci materia: ");
        String materia = Input.getString();
        System.out.println("Inserisci ore: ");
        int ore = Input.getInt();
        return new Docente(nome, cognome, eta, dataNascita, luogoNascita, sesso, stipendio, materia, ore);
    }

    @Override
    public String toString() {
        return "Docente: " + super.toString() +
                "Materia: " + materia + "\n" +
                "Ore: " + ore + "\n";
    }

    public static void main(String[] args) {
        Docente d = new Docente("Andrea", "Moro Detto Rocco", 17, "20/02/2006", "Udine", "M", 1000, "Informatica", 20);
        System.out.println(d);
    }
}
