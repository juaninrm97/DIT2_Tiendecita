package es.studium.Tiendecita;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Seguridad_Baja_Articulo extends JDialog {

    private static final long serialVersionUID = 1L;
    private final JPanel contentPanel = new JPanel();
    private Baja_Articulo bajaArticuloDialog; // Variable para guardar la instancia del diálogo de baja

    /**
     * Create the dialog.
     */
    public Seguridad_Baja_Articulo(Baja_Articulo bajaArticulo) {
        bajaArticuloDialog = bajaArticulo; // Guardamos la instancia del diálogo de baja
        setTitle("TiendecitaJRM - Artículos - Baja");
        setBounds(100, 100, 450, 300);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);

        JLabel lblNewLabel = new JLabel("¿Quiere confirmar esta baja?");
        lblNewLabel.setBounds(130, 61, 219, 14);
        contentPanel.add(lblNewLabel);

        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setBounds(244, 124, 105, 23);
        contentPanel.add(btnConfirmar);

        // Acción del botón Confirmar
        btnConfirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cerrar este diálogo
                dispose();
                
                // Abrir el nuevo diálogo de confirmación, pasando la instancia de bajaArticuloDialog
                Confirmacion_Baja_Articulo confirmacionDialog = new Confirmacion_Baja_Articulo(bajaArticuloDialog);
                confirmacionDialog.setVisible(true);
            }
        });

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cerrar este diálogo
                dispose();

                // Abrir nuevamente el diálogo de baja de artículo
                bajaArticuloDialog.setVisible(true);
            }
        });
        btnCancelar.setBounds(78, 124, 89, 23);
        contentPanel.add(btnCancelar);

        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
        getContentPane().add(buttonPane, BorderLayout.SOUTH);
    }

    /**
     * Launch the application (for testing purposes).
     */
    public static void main(String[] args) {
        try {
            Seguridad_Baja_Articulo dialog = new Seguridad_Baja_Articulo(new Baja_Articulo());
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
