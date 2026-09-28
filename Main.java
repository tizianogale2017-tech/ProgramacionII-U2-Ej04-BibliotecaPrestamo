package Ejercicio4_bibliotecaPrestamo;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro rayuela = new Libro("Rayuela", "Julio Cortázar");
        Socio ana = new Socio("Ana Ruiz", 101);
        Socio pablo = new Socio("Pablo Sosa", 102);

        ana.solicitarPrestamo(biblioteca, rayuela);
        pablo.solicitarPrestamo(biblioteca, rayuela);
    }
}
