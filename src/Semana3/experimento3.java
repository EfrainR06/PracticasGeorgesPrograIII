//Efrain Retana Segura UNA
package Semana3;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class experimento3 extends JFrame {

    public experimento3(){
        super("Experimento 3");

        ajustarComponentes(getContentPane());

        setMinimumSize(new Dimension(400,300));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void ajustarComponentes(Container c){
        c.setLayout(new FlowLayout());
    }

    public void init(){
        setVisible(true);
    }

    public static void main(String[] args){
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFrame.setDefaultLookAndFeelDecorated(true);
        } catch (Exception ex){

        }

        SwingUtilities.invokeLater(() -> {
            mostrarInterfaz();
        });
        System.out.println("Programa inicializado.");
    }

    public static void mostrarInterfaz(){
        experimento3 vista = new experimento3();
        vista.init();
    }
}
