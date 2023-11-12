public class Main {
    public static void main(String[] args) {
        Biblioteca libreria = new Biblioteca("Libreria Caorlotta", "Centro Caorle");
        libreria.addLibro(new Libro("La divina Commedia", "Dante Allighieri", "Storie Fantastiche", 10, 10.2));
        System.out.println(Input.getInt());

        try {
            libreria.addLibro(new Libro("La divina Commedia", "Dante Allighieri", "Storie Fantastiche", 10, 10.2));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hai superato il massimo di libri");
        }

        System.out.println("JAVA");
    }
}