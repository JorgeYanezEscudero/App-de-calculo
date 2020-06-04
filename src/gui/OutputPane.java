package gui;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JSeparator;

public class OutputPane {
	private static JPanel outputPane;
	private static JTextArea resultadoTextField;
	private JSeparator separator;
	
	public OutputPane () {
		outputPane = new JPanel();
		outputPane.setBorder(null);
		outputPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel resultadoLabel = new JLabel("Resultado: ");
		outputPane.add(resultadoLabel);
		
		resultadoTextField = new JTextArea();
		resultadoTextField.setColumns(10);
		resultadoTextField.setLineWrap(true);
		resultadoTextField.setWrapStyleWord(true);
		resultadoTextField.setEditable(false);
		
		outputPane.add(resultadoTextField);
	}
	/* IMPLEMENTAR UPDATE AUTOMATICO
	private void updateResultado (int nuevoResultado) {
		resultado = nuevoResultado;
	}*/
	public JPanel getOutputPane () {
		return outputPane;
	}
	public static JTextArea getResultadoTextField () {
		return resultadoTextField;
	}
}
