package gui;

import java.awt.FlowLayout;

import javax.swing.JPanel;

public class InputPane{
	private JPanel inputPane;
	
	public InputPane () {
		inputPane = new JPanel();
		inputPane.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 5));
	}
	
	public JPanel getInputPane () {
		return inputPane;
	}
}
