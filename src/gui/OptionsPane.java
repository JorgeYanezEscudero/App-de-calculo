package gui;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import inputGUIPkg.DescomposicionPrimos;
import inputGUIPkg.DivisionFracciones;
import inputGUIPkg.Mcd;
import inputGUIPkg.Mcm;
import inputGUIPkg.MultiplicacionFracciones;
import inputGUIPkg.RestaFracciones;
import inputGUIPkg.SimplificacionFracciones;
import inputGUIPkg.SumaFracciones;

import java.awt.Color;
import java.awt.Dimension;

@SuppressWarnings("serial")
public class OptionsPane extends JPanel{
	private static JPanel optionPane;
	private JComboBox<String> listaOperaciones;
	private String [] operaciones = {"Maximo comun divisor", "Minimo comun multiplo",
			"Simplificacion de Fracciones", "Suma de fracciones", "Resta de fracciones",
			"Multiplicacion de Fracciones", "Division de fracciones", "Descomposicion de un numero en factores primos"};
	public OptionsPane () {
		optionPane = new JPanel();
		optionPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		optionPane.setLayout(new BoxLayout(optionPane, BoxLayout.Y_AXIS));
		
		JLabel labelOperaciones = new JLabel("Operaciones");
		optionPane.add(labelOperaciones);
		optionPane.add(Box.createRigidArea(new Dimension(0,10)));
		
		//desplegable de opciones
		listaOperaciones = new JComboBox<String>();
		optionPane.add(Box.createVerticalGlue());
		optionPane.add(Box.createRigidArea(new Dimension(0,10)));
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
		@Override
		public void actionPerformed(ActionEvent e) {
			switch (listaOperaciones.getSelectedItem().toString()) {
				case "Maximo comun divisor":
					MainGui.frameInputPane.removeAll();
					
					Mcd mcd = new Mcd();
					MainGui.frameInputPane.add(mcd.getMcdPane());

					MainGui.mainFrame.revalidate();
					MainGui.mainFrame.pack();
					MainGui.frameInputPane.updateUI();
					break;
				case "Minimo comun multiplo":
					MainGui.frameInputPane.removeAll();
					
					Mcm mcm = new Mcm();
					MainGui.frameInputPane.add(mcm.getMcmPane());

					MainGui.mainFrame.revalidate();
					MainGui.mainFrame.pack();
					MainGui.frameInputPane.updateUI();
					break;
				case "Simplificacion de Fracciones":
					MainGui.frameInputPane.removeAll();
					
					SimplificacionFracciones simplificar = new SimplificacionFracciones();
					MainGui.frameInputPane.add(simplificar.getSimplificacionFraccionesPane());
					
					MainGui.mainFrame.revalidate();
					MainGui.mainFrame.pack();
					MainGui.frameInputPane.updateUI();
					System.out.println("Simplificacion de Fracciones");
					break;
				case "Suma de fracciones":
					MainGui.frameInputPane.removeAll();
					
					SumaFracciones suma = new SumaFracciones();
					MainGui.frameInputPane.add(suma.getSumaFraccionesPane());

					MainGui.mainFrame.revalidate();
					MainGui.mainFrame.pack();
					MainGui.frameInputPane.updateUI();
					System.out.println("Suma de fracciones");
					break;
				case "Resta de fracciones":
					MainGui.frameInputPane.removeAll();
					
					RestaFracciones resta = new RestaFracciones();
					MainGui.frameInputPane.add(resta.getRestaFraccionesPane());

					MainGui.mainFrame.revalidate();
					MainGui.mainFrame.pack();
					MainGui.frameInputPane.updateUI();
					System.out.println("Resta de fracciones");
					break;
				case "Multiplicacion de Fracciones":
					MainGui.frameInputPane.removeAll();
					
					MultiplicacionFracciones multiplicacion = new MultiplicacionFracciones();
					MainGui.frameInputPane.add(multiplicacion.getMultiplicacionFraccionesPane());

					MainGui.mainFrame.revalidate();
					MainGui.mainFrame.pack();
					MainGui.frameInputPane.updateUI();
					System.out.println("Multiplicacion de Fracciones");
					break;
				case "Division de fracciones":
					MainGui.frameInputPane.removeAll();
					
					DivisionFracciones division = new DivisionFracciones();
					MainGui.frameInputPane.add(division.getDivisionFraccionesPane());
					
					MainGui.mainFrame.revalidate();
					MainGui.mainFrame.pack();
					MainGui.frameInputPane.updateUI();
					break;
				case "Descomposicion de un numero en factores primos":
					MainGui.frameInputPane.removeAll();
					
					DescomposicionPrimos descomposicion = new DescomposicionPrimos();
					MainGui.frameInputPane.add(descomposicion.getDescomposicionPane());
					
					MainGui.mainFrame.revalidate();
					MainGui.mainFrame.pack();
					MainGui.frameInputPane.updateUI();
					break;
				default:
					System.out.println("Opción no aceptada.");
					break;
				}
			}
		}
}
