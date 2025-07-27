package Semana1;

import javax.sound.midi.SysexMessage;
import java.security.PublicKey;

public class Semana1_8 {

    public static void main(String[] args){
        Punto[] puntos = {
                new Punto(8, -5),
                new Punto(8, 7),
                new Punto(),
                new Punto(4,3)
        };
        for (int i = 0; i < puntos.length; i++){
            System.out.printf("\t%d -> %s%n",i, puntos[i]);
        }
        System.out.println();

        for (Punto p : puntos){
            System.out.printf("\t%s%n", p);
        }
        System.out.println();


        //--------------------------------------------------------------------
        //--------------------------------------------------------------------
        for (Punto p0 : puntos){
            for (Punto p1 : puntos){
                if (!p0.equals(p1)){
                    System.out.printf("\t%7.3f", p0.distancia(p1));
                } else{
                    System.out.print("\t ----");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

class Punto {

    public Punto (int x, int y){
        this.x = x;
        this.y = y;
    }
    public Punto() {
        this (0,0);
    }
    public double distancia(Punto p1){
        double dx = x - p1.x;
        double dy = y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distancia(){
        return distancia(new Punto());
    }

    @Override
    public String toString(){
        return String.format("(%+3d, %+3d)", x,y);
    }

    private int x;
    private int y;
}