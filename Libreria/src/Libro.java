public class Libro {
    private String titolo;
    private String autore;
    private String genere;
    private int pagine;
    private double prezzo;
    private static int codice;
    public static int nLibri;

    public Libro(String titolo, String autore, String genere, int pagine, double prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
        this.pagine = pagine;
        this.prezzo = prezzo;
        codice++;
        nLibri++;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getPagine() {
        return pagine;
    }

    public void setPagine(int pagine) {
        this.pagine = pagine;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public static int getCodice() {
        return codice;
    }

    public static void setCodice(int codice) {
        Libro.codice = codice;
    }

    public String toString() {

        return null;
    }
}
