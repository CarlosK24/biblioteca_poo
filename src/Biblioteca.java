import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Biblioteca {
    private List<Usuario> usuarios;
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
    public void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    public Optional<Usuario> busquedaIdUser(int id){
        Usuario usuario = null;
        for (Usuario u:usuarios){
            if (u.getId()==id){
                usuario = u;
            }
        }
        return Optional.ofNullable(usuario);
    }
    public Optional<Libro> busquedaIdLibro(int id){
        Libro libro = null;
        for (Libro lib: libros){
            if (lib.getId()==id){
                libro = lib;
            }
        }
        return Optional.ofNullable(libro);
    }
    public boolean estaUsuario(int id){
        return busquedaIdUser(id).isPresent();
    }
    public boolean estaLibro(int id){
        return busquedaIdLibro(id).isPresent();
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
