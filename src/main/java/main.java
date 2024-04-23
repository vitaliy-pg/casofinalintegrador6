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


    private void initializeComponents() {
        JButton btnVenta = new JButton("Añadir Venta");
        JButton btnNombre = new JButton("Añadir Nombre");
        JButton btnNumeroLetra = new JButton("Añadir Número y Letra");
        JButton btnNumeroTexto = new JButton("Añadir Número y Texto");
        JButton btnArchivo = new JButton("Añadir Archivo");

    }
