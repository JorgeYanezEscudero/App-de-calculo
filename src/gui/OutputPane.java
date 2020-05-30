package gui;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class OutputPane extends JPanel{
	private JPanel outputPane;
	private int resultado;
	/**
	 * El con
	 * */
	public OutputPane () {
		outputPane = new JPanel();
		outputPane.setBorder(null);
		outputPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel resultadoLabel = new JLabel("Resultado");
		outputPane.add(resultadoLabel);
		
		JTextArea resultadoTextField = new JTextArea();
		resultadoTextField.setEditable(false);
		resultadoTextField.setLineWrap(true);
		resultadoTextField.setText(String.valueOf(resultado));
		resultadoTextField.setWrapStyleWord(true);
		outputPane.add(resultadoTextField);
	}
	/* IMPLEMENTAR UPDATE AUTOMATICO
	private void updateResultado (int nuevoResultado) {
		resultado = nuevoResultado;
	}*/

	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	public JPanel getOutputPane () {
		return outputPane;
	}
}
