//Efrain Retana Segura UNA
package Semana2.Ejemplo7;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Ejemplo7 {

    public static void main(String[] args) {
        new Ejemplo7().init();
    }

    public void init() {
        Persona[] gente = new Persona[6];
        gente[0] = new Persona("1234", "González", "Roberto");
        gente[1] = new Persona("7826", "Alfaro", "Carolina");
        gente[2] = new Persona("5531", "Montero", "Adriana");

        System.out.println("Tengo " + gente.length + " persona(s).");
        for (int i = 0; i < gente.length; i++) {
            System.out.println(gente[i]);
        }
        System.out.println();

        for (Persona p : gente) { // foreach
            System.out.println(p);
        }
        System.out.println();

        Object[] cosas = new Object[12];
        cosas[0] = new Persona("8951", "Lobo", "Carlos");
        cosas[1] = 123;
        cosas[2] = 24.5;
        cosas[3] = 3f;
        cosas[4] = 7856L;
        cosas[5] = 345_859_422.6;
        cosas[6] = "Hola";
        cosas[7] = new Persona("1892", "Barrantes", "Adriana");
        cosas[8] = new int[]{6, 7, 3, 1};

        for (Object o : cosas) {
            if (o != null) {
                System.out.println(o);
            }
        }
        System.out.println();
    }

}