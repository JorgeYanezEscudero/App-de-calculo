package inputGUIPkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

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
	 * Este listener estará atento de los cambios que se realicen en el text field donde van a escribir el número a descomponer
	 * Y utilizará esos datos (int) para realizar los cáculos y mandar el resultado a en panel de resultado en la MainGui
	 * */
	private class FieldChanged implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				/*String listaFactores = "";
				LinkedList<Integer> lista; //MetodosMatetmaticos.descomposicionfactoresprimos(Integer.parseInt(numeroADescomponer.getText()));
				for (int i = 0; i < lista.size(); i++) {
					listaFactores += String.valueOf(lista.get(i));
				}*/
				Integer.parseInt(numeroADescomponer.getText());//placeholder de la funcion hasta tener el código
				OutputPane.getResultadoTextField().setText(numeroADescomponer.getText()/*listaFactores*/);
				}catch (NumberFormatException formatErr){
					JOptionPane.showMessageDialog(numeroADescomponer, "Tienes que insertar números.");
					numeroADescomponer.setText("0");
				}
		}
	}
}
