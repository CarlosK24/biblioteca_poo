import javax.crypto.spec.OAEPParameterSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GestorPrestamo {
    Biblioteca biblioteca;
    List<Prestamo> prestamos;

    public GestorPrestamo(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        this.prestamos = new ArrayList<>();
    }

    public void prestar(int idLibro,int idUser){
        if(biblioteca.estaLibro(idLibro) && biblioteca.estaUsuario(idUser)){
            Libro libro = biblioteca.busquedaIdLibro(idLibro).get();
            if (!libro.isPrestado()){
                Usuario usuario = biblioteca.busquedaIdUser(idUser).get();
                prestamos.add(new Prestamo(usuario,libro));
                libro.setPrestado(true);
            }else{
                System.out.println("El libro esta prestado");
            }

        }else{
            System.out.println("Error usuario o libro no encontrados");
        }
    }

    public void devolverLibro(int idPrestamo){
        if (buscarPrestamo(idPrestamo).isPresent()){
            Prestamo prestamo = buscarPrestamo(idPrestamo).get();
            prestamo.getLibro().setPrestado(false);
            prestamos.remove(prestamo);

        }else{
            System.out.println("Error prestamo no encontrado");
        }
    }
    public Optional<Prestamo> buscarPrestamo(int id){
        Prestamo prestamo = null;
        for (Prestamo p:prestamos){
            if (p.getId()==id){
                prestamo = p;
            }
        }
        return  Optional.ofNullable(prestamo);
    }
    public void mostrarPrestamos(){
        for (Prestamo p:prestamos){
            System.out.println(p);
        }
    }
}
