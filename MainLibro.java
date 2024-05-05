import java.util.Scanner;

public class MainLibro {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("introduzce ISBN:");
        String ISBN = reader.nextLine();
        System.out.println("introduzce Titulo:");
        String titulo = reader.nextLine();
        System.out.println("introduzce Autor:");
        String autor = reader.nextLine();
        System.out.println("Introduzce Numero de paginas:");
        int numeroDePaginas = reader.nextInt();

        Libro l = new Libro();
        l.ISBN = ISBN;
        l.titulo = titulo;
        l.autor = autor;
        l.numeroDePaginas = numeroDePaginas;
        l.mostrarISBN();
        l.mostrarTitulo();
        l.mostrarAutor();
        l.mostrarNumeroDePaginas();
    }
}
