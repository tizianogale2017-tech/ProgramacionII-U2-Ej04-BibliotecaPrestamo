package Ejercicio4_bibliotecaPrestamo;

public class Socio {
    private String nombre;
    private int numeroSocio;

    public Socio(String nombre, int numeroSocio) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public ComprobantePrestamo solicitarPrestamo(Biblioteca biblioteca, Libro libro) {
        System.out.println(nombre + " solicita \"" + libro.getTitulo() + "\"...");
        ComprobantePrestamo comprobante = biblioteca.prestarLibro(libro, this);
        if (comprobante == null) {
            System.out.println("  -> Solicitud rechazada: el libro no está disponible.");
        } else {
            System.out.println("  -> Solicitud aceptada. " + comprobante);
        }
        return comprobante;
    }
}
