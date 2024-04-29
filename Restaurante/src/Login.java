import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 520, 618);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(37, 154, 31));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton.setBounds(125, 380, 251, 51);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(125, 36, 251, 34);
		panel.add(lblNewLabel);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblUsuario.setBounds(76, 112, 251, 34);
		panel.add(lblUsuario);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setBounds(76, 157, 251, 34);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setHorizontalAlignment(SwingConstants.LEFT);
		lblContrasea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblContrasea.setBounds(76, 219, 251, 34);
		panel.add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(76, 264, 251, 34);
		panel.add(passwordField);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 499, 22);
		panel.add(menuBar);
		
		//Empleados
		
		JMenu empleados = new JMenu("Empleados");
		empleados.setBackground(new Color(39, 245, 15));
		menuBar.add(empleados);
		
		JMenuItem cuentaItem = new JMenuItem("Cuenta");
		cuentaItem.setOpaque(true);
		cuentaItem.setBackground(Color.decode("#27F50F")); 
		empleados.add(cuentaItem);
		
		JMenuItem registroItem = new JMenuItem("Registro");
		registroItem.setOpaque(true);
		registroItem.setBackground(Color.decode("#27F50F")); 
		empleados.add(registroItem);
		
		JMenuItem cierreItem = new JMenuItem("Cierre de sesion");
		cierreItem.setOpaque(true);
		cierreItem.setBackground(Color.decode("#27F50F")); 
		empleados.add(cierreItem);
		
		//Platillos
		
		JMenu platillos = new JMenu("Platillos");
		menuBar.add(platillos);
		
		JMenuItem añadirItem = new JMenuItem("A\u00F1adir");
		añadirItem.setOpaque(true);
		añadirItem.setBackground(Color.decode("#F49E19")); 
		platillos.add(añadirItem);
		
		JMenuItem edicionItem = new JMenuItem("Editar platillos");
		edicionItem.setOpaque(true);
		edicionItem.setBackground(Color.decode("#F49E19")); 
		platillos.add(edicionItem);
		
		JMenuItem listaItem = new JMenuItem("Ver lista de platillos");
		listaItem.setOpaque(true);
		listaItem.setBackground(Color.decode("#F49E19")); 
		platillos.add(listaItem);
		
		
		//Ordenes
		
		JMenu ordenes = new JMenu("Ordenes");
		menuBar.add(ordenes);
		
		JMenuItem nuevaOrdenItem = new JMenuItem("Crear nueva orden");
		nuevaOrdenItem.setOpaque(true);
		nuevaOrdenItem.setBackground(Color.decode("#F7BF64")); 
		ordenes.add(nuevaOrdenItem);
		
		JMenuItem edicionOrdenItem = new JMenuItem("Editar orden");
		edicionOrdenItem.setOpaque(true);
		edicionOrdenItem.setBackground(Color.decode("#F7BF64")); 
		ordenes.add(edicionOrdenItem);
		
		JMenuItem listaOrdenItem = new JMenuItem("Consultar ordenes");
		listaOrdenItem.setOpaque(true);
		listaOrdenItem.setBackground(Color.decode("#F7BF64")); 
		ordenes.add(listaOrdenItem);
		
	}
}
