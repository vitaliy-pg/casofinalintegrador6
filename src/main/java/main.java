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


        customizeButton(btnVenta, new Color(255, 102, 102));
        customizeButton(btnNombre, new Color(102, 204, 255));
        customizeButton(btnNumeroLetra, new Color(255, 178, 102));
        customizeButton(btnNumeroTexto, new Color(153, 204, 255));
        customizeButton(btnArchivo, new Color(102, 255, 178));
        btnVenta.addActionListener(e -> openVentaDialog());
        btnNombre.addActionListener(e -> openNombreDialog());
        btnNumeroLetra.addActionListener(e -> openNumeroLetraDialog());
        btnNumeroTexto.addActionListener(e -> openNumeroTextoDialog());
        btnArchivo.addActionListener(e -> openArchivoDialog());

        add(btnVenta);
        add(btnNombre);
        add(btnNumeroLetra);
        add(btnNumeroTexto);
        add(btnArchivo);


    }

    private void customizeButton(JButton button, Color bgColor) {
        button.setBackground(bgColor);
        button.setOpaque(true);
        button.setBorderPainted(false);
        button.setFont(new Font("Arial", Font.BOLD, 12));
    }
    private void openVentaDialog() {
        JDialog dialog = new JDialog(this, "Añadir Venta", true);
        dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dialog.setLayout(new FlowLayout());
        dialog.setSize(300, 150);

        JTextField txtVenta = new JTextField(20);
        JButton btnAceptar = new JButton("Aceptar");
        JButton btnCancelar = new JButton("Cancelar");

        btnAceptar.addActionListener(e -> {
            // Aquí se añade la venta a la lista
            dialog.dispose();
        });