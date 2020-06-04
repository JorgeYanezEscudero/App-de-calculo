package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class InputPane{
	private JPanel inputPane;
	
	public InputPane () {
		inputPane = new JPanel();
		inputPane.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 5));
		//añadir color y forma de panel
		}
	
	public JPanel getInputPane () {
		return inputPane;
	}
}
