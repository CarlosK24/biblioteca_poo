import java.time.LocalDate;
public class Prestamo {
    private int id;
    private static int idClass;
    private Usuario usuario;
    private Libro libro;
    private LocalDate datePrestamo;
    private LocalDate dateDevolucion;

    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
        id = ++idClass;
        datePrestamo = LocalDate.now();
        dateDevolucion = datePrestamo.plusDays(7);
    }

    public LocalDate getDatePrestamo() {
        return datePrestamo;
    }

    public LocalDate getDateDevolucion() {
        return dateDevolucion;
    }

    public int getId() {
        return id;
    }

    public Libro getLibro() {
        return libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", libro=" + libro +
                ", datePrestamo=" + datePrestamo +
                ", dateDevolucion=" + dateDevolucion +
                '}';
    }
}
