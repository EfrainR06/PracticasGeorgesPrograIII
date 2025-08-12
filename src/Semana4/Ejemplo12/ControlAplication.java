package Semana4.Ejemplo12;

import Semana3.Modelo;

public class ControlAplication {

    public ControlAplication(Modelo modelo){
        this.modelo = modelo;
    }
    public ControlAplication(){
        this(new Modelo());
    }
    private Modelo modelo;
}
