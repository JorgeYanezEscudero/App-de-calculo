package inputPkg;

import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class DescomposicionPrimos extends JPanel{
	private JPanel descomposicionPane;
	
	public DescomposicionPrimos () {
		descomposicionPane = new JPanel();
		JTextField numeroADescomponer = new JTextField("FACTORIZANDO");
		descomposicionPane.add(numeroADescomponer);
	}
	
	public JPanel getDescomposicionPane() {
		return descomposicionPane;
	}
}
