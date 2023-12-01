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
        String[] dati = Input.getGeneralInfo();
        return new Persona(dati[0], dati[1], Integer.parseInt(dati[2]), dati[3], dati[4], dati[5]);
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
        Persona[] p = new Persona[4];
        p[0] = new Persona("Zio", "Perone", 17, "20/02/2006", "Cina", "M");
        p[1] = new Persona("Luca", "Bianchi", 20, "01/01/2000", "Udine", "M");
        p[2] = new Persona("Giulia", "Verdi", 20, "01/01/2000", "Udine", "F");
        p[3] = creaPersona();

        for (Persona persona : p) {
            System.out.println(persona);
        }
    }


}
