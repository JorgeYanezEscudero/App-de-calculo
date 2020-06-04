package inputGUIPkg;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import CalculosMatematicos.MetodosMatematicos;
import gui.OutputPane;

public class Mcm {
	private JPanel mcmPane;
	private JTextField numero1 ,numero2;
	private JButton realizarOperacion;
	
	public Mcm () {
		mcmPane = new JPanel();
		mcmPane.setLayout(new FlowLayout());
		
		numero1 = new JTextField("Numero 1");
		mcmPane.add(numero1);
		
		numero2 = new JTextField("Numero 2");
		mcmPane.add(numero2);
		
		realizarOperacion = new JButton("Obtener mcm");
		realizarOperacion.addActionListener(new calcularResultado());
		mcmPane.add(realizarOperacion);
	}
	
	public JPanel getMcmPane () {
		return mcmPane;
	}
	
	public class calcularResultado implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				 OutputPane.getResultadoTextField().setText("");
				 int n1 = Integer.parseInt(numero1.getText());
				 int n2 = Integer.parseInt(numero2.getText());
				 
				 int resultado = MetodosMatematicos.minimocomunmultiplo(n1,n2);
				 
				 OutputPane.getResultadoTextField().setText(String.valueOf(resultado));
			}catch (NumberFormatException formatErr) {
				JOptionPane.showMessageDialog(realizarOperacion,"Tienes que insertar números.");
			}
		}
		
	}
}
