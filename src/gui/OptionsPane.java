package gui;

import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import inputPkg.DescomposicionPrimos;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class OptionsPane extends JPanel{
	private static JPanel optionPane;
	JComboBox<String> listaOperaciones;
	String [] operaciones = new String[] {"Maximo comun divisor", "Minimo comun multiplo", "Simplificacion de Fracciones", "Suma de fracciones", "Resta de fracciones", "Multiplicacion de Fracciones", "Division de fracciones", "Descomposicion de un numero en factores primos"};
	public OptionsPane () {
		optionPane = new JPanel();
		optionPane.setBorder(null);
		optionPane.setLayout(new FlowLayout(FlowLayout.LEADING, 50, 10));
		
		JLabel labelOperaciones = new JLabel("Operaciones");
		optionPane.add(labelOperaciones);
		
		//desplegable de opciones
		listaOperaciones = new JComboBox<String>();
		labelOperaciones.setLabelFor(listaOperaciones);
		listaOperaciones.setModel(new DefaultComboBoxModel<String>(operaciones));		
		listaOperaciones.addActionListener(new SelectorOpciones());
		
		optionPane.add(listaOperaciones);
	}
	
	public JPanel getOptionPane () {
		return optionPane;
	}
	
	//private class
	private class SelectorOpciones implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			switch (listaOperaciones.getSelectedItem().toString()) {
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
					DescomposicionPrimos x = new DescomposicionPrimos();
					optionPane.add(x.getDescomposicionPane());
					System.out.println("Descomposicion de un numero en factores primos");
					break;
				default:
					System.out.println("Other");
					break;
				}
			}
		}
}
