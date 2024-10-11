package es.studium.Tiendecita;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel_Consulta_Ticket extends JDialog {

    private static final long serialVersionUID = 1L;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            Panel_Consulta_Ticket dialog = new Panel_Consulta_Ticket();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Create the dialog.
     */
    public Panel_Consulta_Ticket() {
        setTitle("TiendecitaJRM_Consulta Ticket");
        setBounds(100, 100, 450, 300);
        getContentPane().setLayout(new BorderLayout());

        // Crear el panel principal y añadirlo a un JScrollPane
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS)); // Layout vertical
        JScrollPane scrollPane = new JScrollPane(mainPanel);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Agregar algunos componentes de ejemplo al panel principal
        for (int i = 1; i <= 20; i++) {
            mainPanel.add(new JLabel("Ticket " + i));
            mainPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Espacio entre los elementos
        }

        // Crear el botón de menú principal
        JButton btnMenuPrincipal = new JButton("Menú Principal");
        btnMenuPrincipal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción para volver al menú principal
                dispose(); // Cerrar este diálogo
                // Aquí puedes agregar la lógica para mostrar el menú principal si es necesario
            }
        });

        // Añadir el botón al panel inferior
        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
        buttonPane.add(btnMenuPrincipal);
        getContentPane().add(buttonPane, BorderLayout.SOUTH);
    }
}
