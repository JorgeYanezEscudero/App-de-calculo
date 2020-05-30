package gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class InputPane extends JPanel{
	private JPanel inputPane;
	
	public InputPane () {
		/*switch (operation) {
			case "Maximo comun divisor":
				System.out.println("Maximo comun divisor");
				break;
			case "Minimo comun multiplo":
				System.out.println("Minimo comun multiplo");
				break;
			case "Simplificacion de Fracciones":
				System.out.println("Simplificacion de Fracciones");
				break;
			case "Suma de fracciones":
				System.out.println("Suma de fracciones");
				break;
			case "Resta de fracciones":
				System.out.println("Resta de fracciones");
				break;
			case "Multiplicacion de Fracciones":
				System.out.println("Multiplicacion de Fracciones");
				break;
			case "Division de fracciones":
				System.out.println("Division de fracciones");
				break;
			case "Descomposicion de un numero en factores primos":
				System.out.println("Descomposicion de un numero en factores primos");
				break;
			default:
				System.out.println("Other");
				break;
		}*/
		
		inputPane = new JPanel();
		inputPane.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_3 = new JPanel();
		inputPane.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JTextField textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		panel_3.add(separator_1);
		
		JLabel separatorLabel = new JLabel("/");
		panel_3.add(separatorLabel);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		panel_3.add(separator);
		
		JTextField textField_1 = new JTextField();
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		inputPane.add(panel_5);
	}
	
	public JPanel getInputPane () {
		return inputPane;
	}
}
