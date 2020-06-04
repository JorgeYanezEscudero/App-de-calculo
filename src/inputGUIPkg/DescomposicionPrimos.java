package inputGUIPkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import gui.OutputPane;

public class DescomposicionPrimos{
	private JPanel descomposicionPane;
	private JTextField numeroADescomponer;
	
	public DescomposicionPrimos () {
		descomposicionPane = new JPanel();
		numeroADescomponer = new JTextField("",10);
		numeroADescomponer.addActionListener(new FieldChanged());
		descomposicionPane.add(numeroADescomponer);
	}
	
	public JPanel getDescomposicionPane() {
		return descomposicionPane;
	}
	/**
	 * Este listener estar� atento de los cambios que se realicen en el text field donde van a escribir el n�mero a descomponer
	 * Y utilizar� esos datos (int) para realizar los c�culos y mandar el resultado a en panel de resultado en la MainGui
	 * */
	private class FieldChanged implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				Integer.parseInt(numeroADescomponer.getText());//placeholder de la funcion hasta tener el c�digo
				OutputPane.getResultadoTextField().setText(numeroADescomponer.getText());
				//MetodosMatetmaticos.descomposicionfactoresprimos(Integer.parseInt(numeroADescomponer.getText()));
				}catch (NumberFormatException formatErr){
					JOptionPane.showMessageDialog(numeroADescomponer, "Tienes que insertar n�meros.");
					numeroADescomponer.setText("0");
				}
		}
	}
}
