package gui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
import javax.swing.DropMode;
/**
 *Ventana principal donde se van a añadir los componentes de la GUI
 * */
@SuppressWarnings({ "serial", "unused" })
public class MainGui extends JFrame{
	private JFrame mainFrame;
	private JTextField textField;
	private JTextField textField_1;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public MainGui () {
		setContentPane(getContentPane());
		mainFrame = new JFrame("Calculator 2000");
		mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainFrame.setBounds(0, 0, 1080, 720);
		mainFrame.getContentPane().setLayout(new GridLayout(1, 3, 15, 0));
		//panel de opciones
		JPanel panel = new JPanel();
		panel.setBorder(null);
		mainFrame.getContentPane().add(panel);
		FlowLayout fl_panel = new FlowLayout(FlowLayout.LEADING, 50, 10);
		panel.setLayout(fl_panel);
		
		JLabel lblNewLabel = new JLabel("Operaciones");
		panel.add(lblNewLabel);
		//desplegable de opciones
		JComboBox comboBox = new JComboBox();
		lblNewLabel.setLabelFor(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"M\u00E1ximo com\u00FAn divisor ", "M\u00EDnimo com\u00FAn m\u00FAltiplo", "Simplificaci\u00F3n de Fracciones", "Suma de fracciones", "Resta de fracciones", "Multiplicaci\u00F3n de Fracciones", "Divisi\u00F3n de fracciones", "Descomposici\u00F3n de un n\u00FAmero en factores primos"}));
		panel.add(comboBox);
		//panel de input
		JPanel panel_1 = new JPanel();
		mainFrame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		panel_3.add(separator_1);
		
		JLabel separatorLabel = new JLabel("/");
		panel_3.add(separatorLabel);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		panel_3.add(separator);
		
		textField_1 = new JTextField();
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		//panel de resultado
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		mainFrame.getContentPane().add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.LEADING, 50, 10));
		
		JLabel lblNewLabel_1 = new JLabel("Resultado");
		panel_2.add(lblNewLabel_1);
		
		JTextArea resultadoTextField = new JTextArea();
		resultadoTextField.setRows(40);
		resultadoTextField.setEditable(false);
		resultadoTextField.setLineWrap(true);
		resultadoTextField.setText("#showtooltip - Shows the spell icon that is listed. For example, '#showtooltip Healing Surge' will show the  Healing Surge icon.\r\n" + 
				"\r\n" + 
				"Arena1 - Top enemy frame.\r\n" + 
				"Arena2 - Middle enemy frame.\r\n" + 
				"Arena3 - Bottom enemy frame.\r\n" + 
				"\r\n" + 
				"Party1 - Middle frame in your party (not you!).\r\n" + 
				"Party2 - Bottom frame in your party (not you!).\r\n" + 
				"\r\n" + 
				"@focus - executes the command at your current focus target.\r\n" + 
				"\r\n" + 
				"/stopcasting - stops your current cast.\r\n" + 
				"\r\n" + 
				"Remember those basic things and go from there. You’ll be creating super advanced macros in no time!\r\n" + 
				"\r\n" + 
				"Feel free to post any questions or concerns in the comment section. I’ll be sure to refer back to this at least once every 48 hours to edit, update and keep current with the new changes/feedback. Thank you for taking the time to read this guide, and I hope it is able to help you out on your journey to becoming a legendary PvPer!");
		resultadoTextField.setWrapStyleWord(true);
		resultadoTextField.setColumns(30);
		panel_2.add(resultadoTextField);
		
		mainFrame.setVisible(true);
	}
	public static void main(String[]args) throws IOException {MainGui maingui = new MainGui();/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));String s = br.readLine();*/
	} 
}
