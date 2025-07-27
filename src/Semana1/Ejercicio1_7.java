//Efrain Retana Segura UNA
package Semana1;

import java.util.Scanner;

public class Ejercicio1_7 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("n?");
        int n = entrada.nextInt();
        int s = 0;

        for(int i = 0; i < n; i++){
            System.out.printf("x (%d de %d)? ", i + 1, n);
            int x = entrada.nextInt();
            s += x;
        }

        System.out.printf("n = %3d%n", n);
        System.out.printf("s = %3d%n", s);
        System.out.printf("p = %3d%n", s/n);
    }
}
