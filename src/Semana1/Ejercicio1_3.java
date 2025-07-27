//Efrain Retana Segura UNA
package Semana1;

import java.util.Scanner;

public class Ejercicio1_3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();

        System.out.println("¡Hola, " + nombre + "!");
        System.out.printf("¡Hola, %s!%n", nombre);

        //-------------------------------------------------------------------
        //-------------------------------------------------------------------

        System.out.print("Ingresa su edad: ");
        int edad = entrada.nextInt();
        System.out.printf("Su edad es de %d años%n", edad);

        //-------------------------------------------------------------------
        //-------------------------------------------------------------------
        System.out.print("Ingrese su peso (en kilos) : ");
        double kilos = entrada.nextDouble();
        double libras = kilos / 0.46;
        System.out.printf("Su peso es de %4.2f kilos (%4.2f libras)%n",kilos,libras);
    }
}
