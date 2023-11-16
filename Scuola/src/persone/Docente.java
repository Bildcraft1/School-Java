package persone;

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

    @Override
    public String toString() {
        return "Docente{" + "nome='" + getNome() + '\'' + ", cognome='" + getCognome() + '\'' + ", CF='" + getCF() + '\'' + ", dataNascita='" + getDataNascita() + '\'' + ", luogoNascita='" + getLuogoNascita() + '\'' + ", sesso='" + getSesso() + '\'' + ", eta=" + getEta() + ", stipendio=" + getStipendio() + ", materia='" + materia + '\'' + ", ore=" + ore + '}';
    }
}
