package Semana4.Ejemplo12;

import Semana4.GestorLibros;

public class Modelo1 {

    public Modelo(){
        datas = new GestorLibros();
    }
    // Observación:
    // Este método no es completamente correcto desde
    // el punto de vista de diseño, pues expone
    // la implementación.
    //
    public GestorLibros obtenerModelo(){
        return datos;
    }
    private final GestorLibros datos;
}
