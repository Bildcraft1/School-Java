public class Biblioteca {
    private Libro[] libri = new Libro[2];
    private String nome;
    private String pos;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public void addLibro(Libro libro) throws ArrayIndexOutOfBoundsException {
        if(Libro.nLibri > libri.length) {
            throw new ArrayIndexOutOfBoundsException("Hai superato il numero di libri aggiungibili");
        }
        libri[Libro.nLibri] = libro;
    }

    public Biblioteca(String nome, String pos) {
        this.nome = nome;
        this.pos = pos;
    }
}
