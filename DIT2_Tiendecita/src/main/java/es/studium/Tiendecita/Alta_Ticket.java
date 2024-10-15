package es.studium.Tiendecita;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Alta_Ticket extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the dialog.
	 */
	public Alta_Ticket() {
		setForeground(Color.BLACK);
		setTitle("TiendecitaJRM - Ticket - Alta");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnMenuPrincipal = new JButton("Menú principal");
		btnMenuPrincipal.setBounds(0, 0, 121, 23);
		contentPanel.add(btnMenuPrincipal);
		
		JLabel lblNewLabel = new JLabel("Introduzca ID Ticket");
		lblNewLabel.setBounds(33, 50, 177, 14);
		contentPanel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(217, 47, 168, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(107, 168, 89, 23);
		contentPanel.add(btnCancelar);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(249, 168, 108, 23);
		contentPanel.add(btnConfirmar);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(33, 81, 177, 14);
		contentPanel.add(lblFecha);
		
		JLabel lblPrecioTotal = new JLabel("Precio total:");
		lblPrecioTotal.setBounds(33, 112, 177, 14);
		contentPanel.add(lblPrecioTotal);
		
		JLabel lblNArtculos = new JLabel("Nº Artículos: ");
		lblNArtculos.setBounds(33, 143, 177, 14);
		contentPanel.add(lblNArtculos);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(217, 78, 168, 20);
		contentPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(217, 109, 168, 20);
		contentPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(217, 137, 168, 20);
		contentPanel.add(textField_3);
		
		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
		
		// Acción para cerrar el diálogo y volver al menú principal (JFrame) al pulsar "Menú principal"
		btnMenuPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cerrar este diálogo
				dispose();
			}
		});
		
		// Acción para cerrar el diálogo al pulsar "Cancelar"
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cerrar este diálogo
				dispose();
			}
		});
		
		btnConfirmar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Cerrar este diálogo
		        dispose();
		        
		        // Crear e invocar el diálogo de seguridad, pasando la instancia actual de Alta_Articulo
		        Seguridad_Alta_Ticket seguridadDialog = new Seguridad_Alta_Ticket(Alta_Ticket.this);
		        seguridadDialog.setVisible(true);
		    }
		});
	}

	/**
	 * Launch the application (for testing purposes).
	 */
	public static void main(String[] args) {
		try {
			Alta_Ticket dialog = new Alta_Ticket();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
