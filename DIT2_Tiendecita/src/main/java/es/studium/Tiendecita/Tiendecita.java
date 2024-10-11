package es.studium.Tiendecita;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tiendecita extends JFrame {
    private JPanel panelArticulos;
    private JPanel panelTickets;  // Nuevo panel para Tickets

    public Tiendecita() {
        setTitle("TiendecitaJRM");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        
        // Botón Artículos
        JButton btnArticulos = new JButton("Artículos");
        btnArticulos.setBounds(0, 0, 100, 30);
        getContentPane().add(btnArticulos);
        
        // Panel que contiene las opciones para Artículos
        panelArticulos = new JPanel();
        panelArticulos.setBounds(42, 32, 129, 111);
        
        // Botones dentro del panel de Artículos
        JButton btnAlta = new JButton("Alta");
        btnAlta.setHorizontalAlignment(SwingConstants.LEFT);
        btnAlta.setBounds(0, 0, 107, 23);
        JButton btnBaja = new JButton("Baja");
        btnBaja.setHorizontalAlignment(SwingConstants.LEFT);
        btnBaja.setBounds(0, 23, 107, 23);
        JButton btnModificacion = new JButton("Modificación");
        btnModificacion.setHorizontalAlignment(SwingConstants.LEFT);
        btnModificacion.setBounds(0, 46, 107, 23);
        JButton btnConsulta = new JButton("Consulta");
        btnConsulta.setHorizontalAlignment(SwingConstants.LEFT);
        btnConsulta.setBounds(0, 69, 107, 23);
        panelArticulos.setLayout(null);
        
        // Añadir botones al panel de Artículos
        panelArticulos.add(btnAlta);
        panelArticulos.add(btnBaja);
        panelArticulos.add(btnModificacion);
        panelArticulos.add(btnConsulta);
        
        // Panel de Artículos inicialmente no visible
        panelArticulos.setVisible(false);
        getContentPane().add(panelArticulos);
        
        // Botón Tickets
        JButton btnTickets = new JButton("Tickets");
        btnTickets.setBounds(99, 0, 100, 30);
        getContentPane().add(btnTickets);
        
        // Panel que contiene las opciones para Tickets
        panelTickets = new JPanel();
        panelTickets.setBounds(134, 32, 100, 70);
        
        // Botones dentro del panel de Tickets
        JButton btnAltaTicket = new JButton("Alta");
        btnAltaTicket.setHorizontalAlignment(SwingConstants.LEFT);
        btnAltaTicket.setBounds(0, 0, 100, 23);
        JButton btnConsultaTicket = new JButton("Consulta");
        btnConsultaTicket.setHorizontalAlignment(SwingConstants.LEFT);
        btnConsultaTicket.setBounds(0, 23, 100, 23);
        panelTickets.setLayout(null);
        
        // Añadir botones al panel de Tickets
        panelTickets.add(btnAltaTicket);
        panelTickets.add(btnConsultaTicket);
        
        // Panel de Tickets inicialmente no visible
        panelTickets.setVisible(false);
        getContentPane().add(panelTickets);
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 484, 30);
        getContentPane().add(menuBar);
        
        // Acción del botón Artículos
        btnArticulos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Alternar la visibilidad del panel Artículos
                panelArticulos.setVisible(!panelArticulos.isVisible());
                
                // Asegurarse de que el panel de Tickets esté oculto al mostrar Artículos
                panelTickets.setVisible(false);
            }
        });

        // Acción del botón Tickets
        btnTickets.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Alternar la visibilidad del panel Tickets
                panelTickets.setVisible(!panelTickets.isVisible());
                
                // Asegurarse de que el panel de Artículos esté oculto al mostrar Tickets
                panelArticulos.setVisible(false);
            }
        });

        // Acción del botón Alta para Artículos
        btnAlta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarAltaArticuloDialog();
            }
        });

        // Acción del botón Baja para Artículos
        btnBaja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarBajaArticuloDialog();
            }
        });

        // Acción del botón Modificación para Artículos
        btnModificacion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarModificacionArticuloDialog();
            }
        });

        // Acción del botón Consulta para Artículos
        btnConsulta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarConsultaArticuloDialog();
            }
        });

        // Acción del botón Alta para Tickets
        btnAltaTicket.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarAltaTicketDialog();
            }
        });

        // Acción del botón Consulta para Tickets
        btnConsultaTicket.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarConsultaTicketDialog();
            }
        });
    }

    // Método para mostrar el diálogo de alta de artículos
    private void mostrarAltaArticuloDialog() {
        Alta_Articulo dialog = new Alta_Articulo();
        dialog.setVisible(true);
    }

    // Método para mostrar el diálogo de baja de artículos
    private void mostrarBajaArticuloDialog() {
        Baja_Articulo dialog = new Baja_Articulo();
        dialog.setVisible(true);
    }

    // Método para mostrar el diálogo de modificación de artículos
    private void mostrarModificacionArticuloDialog() {
        Modificacion_Articulo dialog = new Modificacion_Articulo();
        dialog.setVisible(true);
    }

    // Método para mostrar el diálogo de consulta de artículos
    private void mostrarConsultaArticuloDialog() {
        Consulta_Articulo dialog = new Consulta_Articulo();
        dialog.setVisible(true);
    }

    // Método para mostrar el diálogo de alta de tickets
    private void mostrarAltaTicketDialog() {
        Alta_Ticket dialog = new Alta_Ticket();
        dialog.setVisible(true);
    }

    // Método para mostrar el diálogo de consulta de tickets
    private void mostrarConsultaTicketDialog() {
        Consulta_Ticket dialog = new Consulta_Ticket();
        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        Tiendecita frame = new Tiendecita();
        frame.setVisible(true);
    }
}
