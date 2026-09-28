package Ejercicio4_bibliotecaPrestamo;

public class Biblioteca {
    public ComprobantePrestamo prestarLibro(Libro libro, Socio socio) {
        if (!libro.isDisponible()) {
            return null;
        }
        libro.setDisponible(false);
        return new ComprobantePrestamo(libro, socio);
    }
}
