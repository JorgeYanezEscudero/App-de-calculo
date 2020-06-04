package inputGUIPkg;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class DivisionFracciones {
	private JPanel divisionFraccionesPane;
	
	public DivisionFracciones () {
		divisionFraccionesPane = new JPanel();
		GridLayout gl_divisionFraccionesPane = new GridLayout();
		gl_divisionFraccionesPane.setColumns(2);
		gl_divisionFraccionesPane.setRows(0);
		divisionFraccionesPane.setLayout(gl_divisionFraccionesPane);
		JTextField dividendoF1 = new JTextField("",10);
		divisionFraccionesPane.add(dividendoF1);
		JTextField divisorF1 = new JTextField("",10);
		divisionFraccionesPane.add(divisorF1);
		JTextField dividendoF2 = new JTextField("",10);
		divisionFraccionesPane.add(dividendoF2);
		JTextField divisorF2 = new JTextField("",10);
		divisionFraccionesPane.add(divisorF2);
		
	}
	
	public JPanel getDivisionFraccionesPane () {
		return divisionFraccionesPane;
	}
}
