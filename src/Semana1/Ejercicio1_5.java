//Efrain Retana Segura UNA
package Semana1;

public class Ejercicio1_5 {
    public static void main(String[] args){
        int n = 8;
        System.out.print("[");
        for(int i =0; i < n; i++){
            if(i > 0){
                System.out.printf(", ");
            }
            System.out.print(i);
        }
        System.out.println("]");
        System.out.println();

        for (int i = 40; i >= 0; i -= 4){
            System.out.println(i);
        }
    }
}
