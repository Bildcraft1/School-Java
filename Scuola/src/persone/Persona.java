package persone;

import util.CodiceFiscale;
import util.Input;

public class Persona {

    private String nome, cognome, CF, dataNascita, luogoNascita, sesso;
    private int eta;

    public Persona(String nome, String cognome, int eta, String dataNascita, String luogoNascita, String sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.dataNascita = dataNascita;
        this.luogoNascita = luogoNascita;
        this.sesso = sesso;
        this.CF = CodiceFiscale.generaCF(nome, cognome, dataNascita, luogoNascita, sesso);
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCF() {
        return CF;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public String getLuogoNascita() {
        return luogoNascita;
    }

    public String getSesso() {
        return sesso;
    }

    public int getEta() {
        return eta;
    }

    public static Persona creaPersona() {
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
        return new Persona(nome, cognome, eta, dataNascita, luogoNascita, sesso);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Cognome: " + cognome + "\n" +
                "Codice Fiscale: " + CF + "\n" +
                "Data di nascita: " + dataNascita + "\n" +
                "Luogo di nascita: " + luogoNascita + "\n" +
                "Sesso: " + sesso + "\n" +
                "Età: " + eta + "\n";
    }

    public static void main(String[] args) {
        Persona[] p = new Persona[3];
        p[0] = new Persona("Zio", "Perone", 17, "20/02/2006", "Cina", "M");
        p[1] = new Persona("Luca", "Bianchi", 20, "01/01/2000", "Udine", "M");
        p[2] = new Persona("Giulia", "Verdi", 20, "01/01/2000", "Udine", "F");

        for (Persona persona : p) {
            System.out.println(persona);
        }
    }


}
