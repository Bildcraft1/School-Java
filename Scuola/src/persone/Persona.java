package persone;

import util.CodiceFiscale;

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

    @Override
    public String toString() {
        return "persone.Persona{" + "nome='" + nome + '\'' + ", cognome='" + cognome + '\'' + ", CF='" + CF + '\'' + ", dataNascita='" + dataNascita + '\'' + ", luogoNascita='" + luogoNascita + '\'' + ", sesso='" + sesso + '\'' + ", eta=" + eta + '}';
    }

    public static void main(String[] args) {
        Persona[] p = new Persona[3];
        p[0] = new Persona("Andrea", "Moro Detto Rocco", 17, "20/02/2006", "Udine", "M");
        p[1] = new Persona("Luca", "Bianchi", 20, "01/01/2000", "Udine", "M");
        p[2] = new Persona("Giulia", "Verdi", 20, "01/01/2000", "Udine", "F");

        for (Persona persona : p) {
            System.out.println(persona);
        }
    }


}
