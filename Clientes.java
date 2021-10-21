package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.awt.Toolkit;
import java.net.URL;
import java.util.Iterator;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JDesktopPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Clientes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textPesquisar;
	private JTextField textID;
	private JTextField textNome;
	private JTextField textFone;
	private JTextField textEmail;
	private JTextField textCPF;
	private JTextField textCidade;
	private JTextField textBairro;
	private JTextField textNumero;
	private JTextField textEndereco;
	private JTextField textComplemento;
	private JTextField textCep;
	private JComboBox cboUf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Clientes dialog = new Clientes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Clientes() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Clientes.class.getResource("/icones/logo.png")));
		setBounds(100, 100, 790, 511);
		getContentPane().setLayout(null);
		contentPanel.setBackground(new Color(192, 192, 192));
		contentPanel.setBounds(0, 0, 784, 472);
		contentPanel.setBorder(null);
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			textPesquisar = new JTextField();
			textPesquisar.setBounds(10, 25, 140, 20);
			contentPanel.add(textPesquisar);
			textPesquisar.setColumns(10);
		}
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(Clientes.class.getResource("/icones/pesquisar.png")));
			lblNewLabel.setBounds(160, 13, 32, 32);
			contentPanel.add(lblNewLabel);
		}
		
		JLabel lblNewLabel_1 = new JLabel("*Campo Obrigat\u00F3rio");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(460, 40, 143, 14);
		contentPanel.add(lblNewLabel_1);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(20, 56, 754, 117);
		contentPanel.add(desktopPane);
		
		textID = new JTextField();
		textID.setBounds(44, 221, 57, 20);
		contentPanel.add(textID);
		textID.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("*ID");
		lblNewLabel_2.setBounds(15, 224, 19, 14);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("*Nome");
		lblNewLabel_3.setBounds(122, 224, 46, 14);
		contentPanel.add(lblNewLabel_3);
		
		textNome = new JTextField();
		textNome.setBounds(160, 221, 165, 20);
		contentPanel.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("*Fone");
		lblNewLabel_4.setBounds(361, 224, 32, 14);
		contentPanel.add(lblNewLabel_4);
		
		textFone = new JTextField();
		textFone.setBounds(408, 221, 121, 20);
		contentPanel.add(textFone);
		textFone.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("E-mail");
		lblNewLabel_5.setBounds(10, 260, 56, 14);
		contentPanel.add(lblNewLabel_5);
		
		textEmail = new JTextField();
		textEmail.setBounds(54, 257, 86, 20);
		contentPanel.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("*CPF");
		lblNewLabel_6.setBounds(560, 224, 32, 14);
		contentPanel.add(lblNewLabel_6);
		
		textCPF = new JTextField();
		textCPF.setBounds(604, 221, 127, 20);
		contentPanel.add(textCPF);
		textCPF.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("*Cidade");
		lblNewLabel_7.setBounds(474, 310, 69, 14);
		contentPanel.add(lblNewLabel_7);
		
		textCidade = new JTextField();
		textCidade.setBounds(553, 307, 86, 20);
		contentPanel.add(textCidade);
		textCidade.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("*Bairro");
		lblNewLabel_8.setBounds(10, 348, 46, 14);
		contentPanel.add(lblNewLabel_8);
		
		textBairro = new JTextField();
		textBairro.setBounds(66, 345, 140, 20);
		contentPanel.add(textBairro);
		textBairro.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("*Número");
		lblNewLabel_9.setBounds(245, 348, 57, 14);
		contentPanel.add(lblNewLabel_9);
		
		textNumero = new JTextField();
		textNumero.setBounds(318, 345, 86, 20);
		contentPanel.add(textNumero);
		textNumero.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("*Endereço");
		lblNewLabel_10.setBounds(9, 310, 64, 14);
		contentPanel.add(lblNewLabel_10);
		
		textEndereco = new JTextField();
		textEndereco.setBounds(83, 307, 381, 20);
		contentPanel.add(textEndereco);
		textEndereco.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Complemento");
		lblNewLabel_11.setBounds(422, 348, 86, 14);
		contentPanel.add(lblNewLabel_11);
		
		textComplemento = new JTextField();
		textComplemento.setBounds(518, 345, 157, 20);
		contentPanel.add(textComplemento);
		textComplemento.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("*UF");
		lblNewLabel_12.setBounds(649, 310, 26, 14);
		contentPanel.add(lblNewLabel_12);
		
		cboUf = new JComboBox();
		cboUf.setModel(new DefaultComboBoxModel(new String[] {"", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		cboUf.setBounds(685, 306, 46, 22);
		contentPanel.add(cboUf);
		
		JButton btnAdicionar = new JButton("");
		btnAdicionar.setBackground(new Color(192, 192, 192));
		btnAdicionar.setBorder(null);
		btnAdicionar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdicionar.setToolTipText("Adicionar");
		btnAdicionar.setIcon(new ImageIcon(Clientes.class.getResource("/icones/create.png")));
		btnAdicionar.setBounds(258, 387, 68, 68);
		contentPanel.add(btnAdicionar);
		
		JButton btnEditar = new JButton("");
		btnEditar.setBackground(new Color(192, 192, 192));
		btnEditar.setBorder(null);
		btnEditar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEditar.setIcon(new ImageIcon(Clientes.class.getResource("/icones/update.png")));
		btnEditar.setToolTipText("Editar");
		btnEditar.setBounds(361, 387, 68, 68);
		contentPanel.add(btnEditar);
		
		JButton btnDeletar = new JButton("");
		btnDeletar.setBorder(null);
		btnDeletar.setBackground(new Color(192, 192, 192));
		btnDeletar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDeletar.setIcon(new ImageIcon(Clientes.class.getResource("/icones/delete.png")));
		btnDeletar.setToolTipText("Deletar");
		btnDeletar.setBounds(476, 387, 68, 68);
		contentPanel.add(btnDeletar);
		
		JLabel lblNewLabel_13 = new JLabel("CEP");
		lblNewLabel_13.setBounds(170, 260, 46, 14);
		contentPanel.add(lblNewLabel_13);
		
		textCep = new JTextField();
		textCep.setBounds(215, 257, 110, 20);
		contentPanel.add(textCep);
		textCep.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarCep();
			}
		});
		btnBuscar.setBounds(335, 256, 89, 23);
		contentPanel.add(btnBuscar);
	}//fim do construtor
	
	/**
	 * buscarCep
	 */
	private void buscarCep() {
		String logradouro = "";
		String tipoLogradouro = "";
		String resultado = null;
		String cep = textCep.getText();
		try {
			URL url = new URL("http://cep.republicavirtual.com.br/web_cep.php?cep=" + cep + "&formato=xml");
			SAXReader xml = new SAXReader();
			Document documento = xml.read(url);
			Element root = documento.getRootElement();
			for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {
				Element element = it.next();
				if (element.getQualifiedName().equals("cidade")) {
					textCidade.setText(element.getText());
				}
				if (element.getQualifiedName().equals("bairro")) {
					textBairro.setText(element.getText());
				}
				if (element.getQualifiedName().equals("uf")) {
					cboUf.setSelectedItem(element.getText());
				}
				if (element.getQualifiedName().equals("tipo_logradouro")) {
					tipoLogradouro = element.getText();
				}
				if (element.getQualifiedName().equals("logradouro")) {
					logradouro = element.getText();
				}
				if (element.getQualifiedName().equals("resultado")) {
					resultado = element.getText();
					if (resultado.equals("1")) {
						//lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png")));
					} else {
						JOptionPane.showMessageDialog(null, "CEP n�o encontrado");
					}
				}
			}
			textEndereco.setText(tipoLogradouro + " " + logradouro);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

