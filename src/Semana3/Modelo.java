package Semana3;

public class Modelo {

    public Modelo() {
        this.kilos = 0.0;
    }
    public double kilos(){
        return kilos;
    }
    public void fijarKilos(double kilos){
        this.kilos = Math.max(0.0, kilos);
    }

    public double libras(){
        return kilos / KILOS_POR_LIBRA;
    }

    public void fijarLibras(double libras){
        fijarKilos(libras * KILOS_POR_LIBRA);
    }

    public static final double KILOS_POR_LIBRA = 0.460;
    private double kilos;
}