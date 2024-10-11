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

public class Alta_Articulo extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Create the dialog.
	 */
	public Alta_Articulo() {
		setForeground(Color.BLACK);
		setTitle("TiendecitaJRM - Artículo - Alta");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnMenuPrincipal = new JButton("Menú principal");
		btnMenuPrincipal.setBounds(0, 0, 121, 23);
		contentPanel.add(btnMenuPrincipal);
		
		JLabel lblNewLabel = new JLabel("Introduzca alta de artículo:");
		lblNewLabel.setBounds(39, 78, 177, 14);
		contentPanel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(205, 75, 168, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(110, 123, 89, 23);
		contentPanel.add(btnCancelar);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(234, 123, 108, 23);
		contentPanel.add(btnConfirmar);
		
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
		        Seguridad_Alta_Articulo seguridadDialog = new Seguridad_Alta_Articulo(Alta_Articulo.this);
		        seguridadDialog.setVisible(true);
		    }
		});
	}

	/**
	 * Launch the application (for testing purposes).
	 */
	public static void main(String[] args) {
		try {
			Alta_Articulo dialog = new Alta_Articulo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
