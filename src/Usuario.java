public class Usuario {
    private int id;
    private static int idClass;
    private String nombre,direccion;
    private boolean penalizado;

    public Usuario(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        id = ++idClass;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isPenalizado() {
        return penalizado;
    }

    public void setPenalizado(boolean penalizado) {
        this.penalizado = penalizado;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", penalizado=" + penalizado +
                '}';
    }
}
