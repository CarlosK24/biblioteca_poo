import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        GestorPrestamo gp = new GestorPrestamo(biblioteca);
        int option ;
       do{
           System.out.println("Ingrese una opcion\n"+"1 Agregar un libro\n2 Agregar usuario\n3 Prestar libro\n4 Devolver libro\n" +
                   "5 ver libros\n6 ver usuarios\n7 ver prestamos\n8 salir\n");
           option = sc.nextInt();

           switch (option){
               case 1 :
                   System.out.println("Ingrese el nombre del libro:");
                   String nombre = sc.nextLine();
                   sc.nextLine();
                   System.out.println("ingrese editorial:");
                   String edit = sc.nextLine();
                   biblioteca.agregarLibro(new Libro(nombre,edit));
                   System.out.println("Libro agregado");
                   break;
               case 2 :
                   System.out.println("Ingrese el nombre de usuario:");
                   String nombreUsuario = sc.nextLine();
                   sc.nextLine();
                   System.out.println("ingrese direccion:");
                   String dire = sc.nextLine();
                   biblioteca.agregarUsuario(new Usuario(nombreUsuario,dire));
                   System.out.println("Usuario agregado");
                   break;
               case 3 :
                   System.out.println("ingrese id de usuario a prestar libro:");
                   int idUsuarioPres = sc.nextInt();
                   System.out.println("Ingrese id del libro a prestar:");
                   int idLibroPres=sc.nextInt();
                   gp.prestar(idLibroPres,idUsuarioPres);
                   break;
               case 4 :
                   System.out.println("Ingrese el id del prestamo a devolver:");
                   int prestamo = sc.nextInt();
                   gp.devolverLibro(prestamo);
                   break;
               case 5 :
                   System.out.println("======Mostrando libros======");
                   if (biblioteca.getLibros().size()<1){
                       System.out.println("No hay libros");
                   }else{
                       for (Libro libro:biblioteca.getLibros()){
                           System.out.println(libro);
                       }
                   }
                   break;
               case 6 :
                   if (biblioteca.getUsuarios().size()<1){
                       System.out.println("No hay usuarios");
                   }else{
                       for (Usuario u:biblioteca.getUsuarios()){
                           System.out.println(u);
                       }
                   }
                   break;
               case 7 :
                   if (gp.prestamos.size()>0){
                       gp.mostrarPrestamos();
                   }else{
                       System.out.println("No hay prestamos");
                   }
                   break;
               case 8 :
                   break;
               default:
                   System.out.println("Error opcion invalida");
           }

       }while(option<8);
       sc.close();
    }
}
