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
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import gui.OutputPane;

public class SimplificacionFracciones {
	private JPanel simplificacionFraccionesPane;
	private JTextField numeradorF1,denominadorF1;
	private JButton realizarOperacion;
	
	public SimplificacionFracciones () {
		simplificacionFraccionesPane = new JPanel();
		simplificacionFraccionesPane.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		
		numeradorF1 = new JTextField("Numerador",10);
		numeradorF1.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.gridx = 0;
		gbc.gridy = 0;
		simplificacionFraccionesPane.add(numeradorF1,gbc);
		
		JLabel division1Label = new JLabel("_______");
		division1Label.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.gridx = 0;
		gbc.gridy = 1;
		simplificacionFraccionesPane.add(division1Label,gbc);

		denominadorF1 = new JTextField("Denominador",10);
		denominadorF1.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.gridx = 0;
		gbc.gridy = 2;
		simplificacionFraccionesPane.add(denominadorF1,gbc);
		
		realizarOperacion = new JButton("Obtener Resultado");
		gbc.gridx = 1;
		gbc.gridy = 1;
		realizarOperacion.addActionListener(new calcularResultado());
		simplificacionFraccionesPane.add(realizarOperacion,gbc);
		
	}
	
	public JPanel getSimplificacionFraccionesPane () {
		return simplificacionFraccionesPane;
	}
	
	private class calcularResultado implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				/*
				 * Fraccion resultado = CalculosMatematicos.simplificar(new Fraccion(Integer.parseInt(numeradorF1.getText()),Integer.parseInt(denominadorF1.getText())));
				 * OutputPane.getResultadoTextField().setText(String.valueOf(resultado.numerador)+"/"+String.valueOf(resultado.denominador));
				 * */
				OutputPane.getResultadoTextField().setText("Operacion realizada");
			}catch (NumberFormatException formatErr) {
				JOptionPane.showMessageDialog(realizarOperacion,"Tienes que insertar números.");
			}
		}
	}
}
