//Efrain Retana Segura UNA
package Semana1;

import java.util.Scanner;

public class Ejercicio1_4 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int valor = entrada.nextInt();

        if (valor > 0){
            System.out.println("El número es positivo.");
        } else if (valor < 0){
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es 0 (cero).");
        }
        System.out.println();

        boolean esPar = (valor % 2) == 0;
        if (esPar){
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        System.out.printf("El número es %s.%n", ((valor % 2)== 0) ? "par" : "impar");
    }
}
