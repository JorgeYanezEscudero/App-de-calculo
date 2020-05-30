package gui;

import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class OptionsPane extends JPanel{
	private JPanel optionPane; 
	public OptionsPane () {
		optionPane = new JPanel();
		optionPane.setBorder(null);
		optionPane.setLayout(new FlowLayout(FlowLayout.LEADING, 50, 10));
		
		JLabel labelOperaciones = new JLabel("Operaciones");
		optionPane.add(labelOperaciones);
		
		//desplegable de opciones
		JComboBox<String> comboBox = new JComboBox<String>();
		labelOperaciones.setLabelFor(comboBox);
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Maximo comun divisor", "Minimo comun multiplo", "Simplificacion de Fracciones", "Suma de fracciones", "Resta de fracciones", "Multiplicacion de Fracciones", "Division de fracciones", "Descomposicion de un numero en factores primos"}));
		optionPane.add(comboBox,1);
	}
	
	public JPanel getOptionPane () {
		return optionPane;
	}
	
	
}
