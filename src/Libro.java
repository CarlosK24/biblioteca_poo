public class Libro {
    private int id;
    private static int idClass;
    private String nombre,editorial;
    private boolean prestado;

    public Libro( String nombre, String editorial) {
        this.id = ++idClass;
        this.nombre = nombre;
        this.editorial = editorial;
        prestado = false;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", editorial='" + editorial + '\'' +
                ", prestado=" + prestado +
                '}';
    }
}
