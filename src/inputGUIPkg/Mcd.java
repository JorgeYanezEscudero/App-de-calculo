package inputGUIPkg;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import gui.OutputPane;

public class Mcd {
	private JPanel mcdPane;
	private JTextField numero1 ,numero2;
	private JButton realizarOperacion;
	
	public Mcd () {
		mcdPane = new JPanel();
		mcdPane.setLayout(new FlowLayout());
		
		numero1 = new JTextField("Numero 1");
		mcdPane.add(numero1);
		
		numero2 = new JTextField("Numero 2");
		mcdPane.add(numero2);
		
		realizarOperacion = new JButton("Obtener Resultado");
		realizarOperacion.addActionListener(new calcularResultado());
		mcdPane.add(realizarOperacion);
	}
	
	public JPanel getMcdPane () {
		return mcdPane;
	}
	
	public class calcularResultado implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				/*
				 * int n1 = Integer.parseInt(numero1.getText()));
				 * int n2 = Integer.parseInt(numero2.getText()));
				 * int resultado = CalculosMatematicos.maximocomundivisor(n1,n2);
				 * OutputPane.getResultadoTextField().setText(String.valueOf(resultado);
				 * */
				OutputPane.getResultadoTextField().setText("Operacion realizada");
			}catch (NumberFormatException formatErr) {
				JOptionPane.showMessageDialog(realizarOperacion,"Tienes que insertar números.");
			}
		}
		
	}
}
