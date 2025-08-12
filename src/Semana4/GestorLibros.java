//Efrain Retana Segura UNA
package Semana4;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class GestorLibros {

    public GestorLibros() {
        libros = new HashMap<>();
    }

    public int cantidad() {
        return libros.size();
    }

    public boolean existe(int id) {
        return libros.containsKey(id);
    }

    public boolean agregar(Libro libroNuevo) {
        boolean exito = false;
        if (!existe(libroNuevo.getId())) {
            libros.putIfAbsent(libroNuevo.getId(), libroNuevo);
            exito = true;
        }
        return exito;
    }

    public Libro recuperar(int id) {
        return libros.get(id);
    }

    public Libro buscarPorTitulo(String titulo) {
        Libro encontrado = null;
        for (Libro b : libros.values()) {
            if (b.getTitulo().equals(titulo)) {
                encontrado = b;
                break;
            }
        }
        return encontrado;
    }

    public boolean actualizar(Libro libroPorActualizar) {
        boolean exito = false;
        if (existe(libroPorActualizar.getId())) {
            libros.putIfAbsent(libroPorActualizar.getId(), libroPorActualizar);
            exito = true;
        }
        return exito;
    }

    public Libro eliminar(int id) {
        return libros.remove(id);
    }

    public void cargar(String archivo) throws Exception {
        Scanner entrada = new Scanner(new File(archivo));
        entrada.useDelimiter("[\t\n]");

        while (entrada.hasNext()) {

            int id = entrada.nextInt();
            String titulo = entrada.next();
            String autor = entrada.next();
            int año = entrada.nextInt();
            String genero = entrada.next();
            String isbn = entrada.next();

            Libro libroNuevo = new Libro(id, titulo, autor, año, genero, isbn);
            agregar(libroNuevo);
        }
    }

    public void cargarXML(String archivoXML) throws Exception {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (Libro b : libros.values()) {
            sb.append(String.format("%n\t%s,", b));
        }
        sb.append("\n]");
        return sb.toString();
    }

    public void borrarTodos() {
        libros.clear();
    }

    private final HashMap<Integer, Libro> libros;
}