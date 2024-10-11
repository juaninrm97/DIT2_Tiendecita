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

public class Seguridad_Modificacion_Articulo extends JDialog {

    private static final long serialVersionUID = 1L;
    private final JPanel contentPanel = new JPanel();
    private Modificacion_Articulo modificacionArticuloDialog; // Variable para guardar la instancia del diálogo de alta

    /**
     * Create the dialog.
     */
    public Seguridad_Modificacion_Articulo(Modificacion_Articulo modificacionArticulo) {
    	modificacionArticuloDialog = modificacionArticulo; // Guardamos la instancia del diálogo de alta
        setTitle("TiendecitaJRM - Artículos - Modificación");
        setBounds(100, 100, 450, 300);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);

        JLabel lblNewLabel = new JLabel("¿Quiere confirmar esta modificación?");
        lblNewLabel.setBounds(130, 61, 219, 14);
        contentPanel.add(lblNewLabel);

        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setBounds(244, 124, 105, 23);
        contentPanel.add(btnConfirmar);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cerrar este diálogo
                dispose();

                // Abrir nuevamente el diálogo de alta de artículo
                modificacionArticuloDialog.setVisible(true);
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
            Seguridad_Modificacion_Articulo dialog = new Seguridad_Modificacion_Articulo(new Modificacion_Articulo());
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}