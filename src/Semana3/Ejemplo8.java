package Semana3;

import Semana3.VentanaAplicacion2;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
public class Ejemplo8 {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFrame.setDefaultLookAndFeelDecorated(true);
        } catch (ClassNotFoundException
                 | IllegalAccessException
                 | InstantiationException
                 | UnsupportedLookAndFeelException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }

        new Ejemplo8().init();

        System.out.println("Aplicación inicializada..");
    }

    private void init() {
        SwingUtilities.invokeLater(() -> {
            mostrarInterfaz();
        });
    }

    private void mostrarInterfaz() {
        System.out.println("Iniciando interfaz..");

        VentanaAplicacion2 vistaPrincipal = new VentanaAplicacion2("Ejemplo 9");
        vistaPrincipal.init();
    }

}

