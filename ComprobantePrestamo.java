package Ejercicio4_bibliotecaPrestamo;

import java.time.LocalDate;

public class ComprobantePrestamo {
    private Libro libro;
    private Socio socio;
    private LocalDate fechaDevolucion;

    public ComprobantePrestamo(Libro libro, Socio socio) {
        this.libro = libro;
        this.socio = socio;
        this.fechaDevolucion = LocalDate.now().plusDays(14);
    }

    @Override
    public String toString() {
        return "Comprobante: \"" + libro.getTitulo() + "\" para el socio N° " + socio.getNumeroSocio()
                + " - Devolver antes del " + fechaDevolucion;
    }
}
