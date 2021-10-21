package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Principal extends JFrame {
	private JPanel contentPane;
	private JLabel lblData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				setarData();
			}
			
			
		});
		setTitle("PressStart ");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/icones/logo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 505);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRelátorio = new JButton("");
		btnRelátorio.setToolTipText("Relat\u00F3rio");
		btnRelátorio.setBorder(null);
		btnRelátorio.setBackground(new Color(192, 192, 192));
		btnRelátorio.setIcon(new ImageIcon(Principal.class.getResource("/icones/relatorios.png")));
		btnRelátorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRelátorio.setBounds(48, 51, 128, 128);
		contentPane.add(btnRelátorio);
		
		JButton btnTécnico = new JButton("");
		btnTécnico.setToolTipText("Suporte t\u00E9cnico");
		btnTécnico.setBorder(null);
		btnTécnico.setBackground(new Color(192, 192, 192));
		btnTécnico.setIcon(new ImageIcon(Principal.class.getResource("/icones/tecnico.png")));
		btnTécnico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTécnico.setBounds(48, 268, 128, 128);
		contentPane.add(btnTécnico);
		
		JButton btnCliente = new JButton("");
		btnCliente.setToolTipText("Cliente");
		btnCliente.setBackground(new Color(192, 192, 192));
		btnCliente.setBorder(null);
		btnCliente.setIcon(new ImageIcon(Principal.class.getResource("/icones/clientesss.png")));
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCliente.setBounds(236, 268, 128, 128);
		contentPane.add(btnCliente);
		
		JButton btnSobre = new JButton("");
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		
		btnSobre.setToolTipText("Ajuda");
		btnSobre.setBackground(new Color(192, 192, 192));
		btnSobre.setBorder(null);
		btnSobre.setIcon(new ImageIcon(Principal.class.getResource("/icones/sobre.png")));
		btnSobre.setBounds(520, 51, 137, 128);
		contentPane.add(btnSobre);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 424, 696, 42);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/icones/dbof.png")));
		lblNewLabel.setBounds(10, 0, 32, 31);
		panel.add(lblNewLabel);
		
		lblData = new JLabel("");
		lblData.setForeground(Color.WHITE);
		lblData.setBackground(Color.WHITE);
		lblData.setBounds(434, 11, 252, 20);
		panel.add(lblData);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setToolTipText("Conserto");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon(Principal.class.getResource("/icones/conserto retro.png")));
		btnNewButton.setBounds(236, 51, 128, 128);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Press");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(497, 326, 79, 42);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Start");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_2.setBounds(586, 333, 100, 28);
		contentPane.add(lblNewLabel_2);
	}
	
	private void setarData() {
		Date dataLabel = new Date();
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
		lblData.setText(formatador.format(dataLabel));
		
	}
}
