
public class Libro {
    String ISBN;
    String titulo;
    String autor;
    int numeroDePaginas;

    public void mostrarISBN() {
        System.out.println("El ISBN es:" + this.ISBN);
    }

    public void mostrarTitulo() {
        System.out.println("El titulo del libro es:" + this.titulo);

    }

    public void mostrarAutor() {
        System.out.println("El autor es:" + this.autor);
    }

    public void mostrarNumeroDePaginas() {
        System.out.println(" El numero de paginas es:" + this.numeroDePaginas);
    }

}
