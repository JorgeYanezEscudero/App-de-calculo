package inputGUIPkg;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import gui.OutputPane;

public class DivisionFracciones {
	private JPanel divisionFraccionesPane;
	private JTextField numeradorF1,denominadorF1,numeradorF2,denominadorF2;
	private JButton realizarOperacion;
	
	public DivisionFracciones () {
		divisionFraccionesPane = new JPanel();
		divisionFraccionesPane.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		
		numeradorF1 = new JTextField("Numerador",10);
		numeradorF1.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.gridx = 0;
		gbc.gridy = 0;
		divisionFraccionesPane.add(numeradorF1,gbc);
		
		JLabel division1Label = new JLabel("_______");
		division1Label.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.gridx = 0;
		gbc.gridy = 1;
		divisionFraccionesPane.add(division1Label,gbc);

		denominadorF1 = new JTextField("Denominador",10);
		denominadorF1.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.gridx = 0;
		gbc.gridy = 2;
		divisionFraccionesPane.add(denominadorF1,gbc);
		
		numeradorF2 = new JTextField("Numerador",10);
		numeradorF2.setHorizontalAlignment(SwingConstants.CENTER);  
		gbc.gridx = 2;
		gbc.gridy = 0;
		divisionFraccionesPane.add(numeradorF2,gbc);
		
		JLabel divisionDeFraccionesLabel = new JLabel(":");
		divisionDeFraccionesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.gridx = 1;
		gbc.gridy = 1;
		divisionFraccionesPane.add(divisionDeFraccionesLabel,gbc);
		
		JLabel division2Label = new JLabel("_______");
		division2Label.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.gridx = 2;
		gbc.gridy = 1;
		divisionFraccionesPane.add(division2Label,gbc);
		
		denominadorF2 = new JTextField("Denominador",10);
		denominadorF2.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.gridx = 2;
		gbc.gridy = 2;
		divisionFraccionesPane.add(denominadorF2,gbc);

		realizarOperacion = new JButton("Obtener Resultado");
		gbc.gridwidth = 3;
		gbc.gridx = 0;
		gbc.gridy = 3;
		realizarOperacion.addActionListener(new calcularResultado());
		divisionFraccionesPane.add(realizarOperacion,gbc);
		
	}
	
	public JPanel getDivisionFraccionesPane () {
		return divisionFraccionesPane;
	}
	
	private class calcularResultado implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				/*
				 * Fraccion f1 = new Fraccion(Integer.parseInt(numeradorF1.getText()),Integer.parseInt(denominadorF1.getText()));
				 * Fraccion f2 = new Fraccion(Integer.parseInt(numeradorF2.getText()),Integer.parseInt(denominadorF2.getText()));
				 * Fraccion resultado = CalculosMatematicos.dividirFracciones(f1,f2);
				 * OutputPane.getResultadoTextField().setText(String.valueOf(resultado.numerador)+"/"+String.valueOf(resultado.denominador));
				 * */
				OutputPane.getResultadoTextField().setText("Operacion realizada");
			}catch (NumberFormatException formatErr) {
				JOptionPane.showMessageDialog(realizarOperacion,"Tienes que insertar números.");
			}
		}
	}
}
