package gui;

import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class InputPane extends JPanel {
	private JPanel inputPane;
	
	public InputPane () {
		inputPane = new JPanel();
		inputPane.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 5));
	}
	
	public JPanel getInputPane () {
		return inputPane;
	}
}
