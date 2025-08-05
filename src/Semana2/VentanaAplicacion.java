package Semana2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class VentanaAplicacion extends JFrame {
    public VentanaAplicacion(String titulo) {
        super(titulo);

        ajustarComponentes(getContentPane());
        //pack()
        setResizable(true);
        setSize(new Dimension(600,400));
        setMinimumSize(new Dimension(320, 240));

        setLocationByPlatform(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void ajustarComponentes(Container c) {
        c.setLayout(new FlowLayout(FlowLayout.LEFT));

        info = new JLabel();
        info.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 24));
        info.setForeground(Color.BLUE);
        c.add(info);
    }

    public void init() {
        setVisible(true);
    }

    public void mostrarMensaje(String msj){
        info.setText(msj);
     }
     private JLabel info;
}
