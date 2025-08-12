//Efrain Retana Segura UNA
package Semana4;

public class ModeloLibros_1 {

    public static void main(String[] args) {
        GestorLibros Libros = new GestorLibros();
        try {
            libros.cargar("../libros.txt");
            System.out.printf("Se cargaron %d libros.%n", libros.cantidad());
        } catch (Exception ex) {
            System.err.printf("Excepcion: '%s'%n", ex.getMessage());
        }

        System.out.println(libros);
        System.out.println();

        Libro otro = new Libro(1 , "Mamita Yunai", "Carlos Luis Fallas",
                1941,"Novela social", "978-94-376-4693-0");
        System.out.println(otro);
        System.out.println();

        System.out.println(libros.agregar(otro));
        otro.setId(21);
        System.out.println(libros.agregar(otro));
        System.out.println();

        System.out.println(libros.eliminar(4));
        System.out.println(libros.eliminar(4));
        System.out.printlin();
    }
}
