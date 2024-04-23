import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class main extends JFrame {
    public GestionDatosDinamicos() {
        setTitle("Gestión de Datos Dinámicos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        initializeComponents();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
