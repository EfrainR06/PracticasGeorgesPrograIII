//Efrain Retana Segura UNA
package Semana1;

public class Ejercicio1_6 {
    public static void main(String[] args){
        int m = 10;
        int n = 12;

        System.out.printf("%3s\t", " ");
        for(int j = 1; j <= n; j++){
            System.out.printf("%3d", j);
        }
        System.out.println();
        System.out.printf("%3s\t%s%n", " ", "====".repeat(n));

        for(int i = 1; i <= m; i++){
            System.out.printf("%3d\t", i);
            for(int j = 1; j <= n; j++){
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}
