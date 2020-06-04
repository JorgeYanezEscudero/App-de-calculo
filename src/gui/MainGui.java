package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import inputGUIPkg.DescomposicionPrimos;

/**
 *Ventana principal donde se van a añadir los componentes de la GUI
 * */
@SuppressWarnings({ "serial", "unused" })
public class MainGui extends JFrame{
	public static JFrame mainFrame;
	public static JPanel frameOptionPane;
	public static JPanel frameInputPane;
	public static JPanel frameOutputPane;
	
	public MainGui () {
		setContentPane(getContentPane());
		mainFrame = new JFrame("Calculator 2000");
		mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);	
		mainFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 20));
		mainFrame.setPreferredSize(new Dimension(720,480));
		//mainFrame.setPreferredSize(new Dimension(480,160));testeo de resize
		mainFrame.setResizable(false);
		
		//panel de opciones
		OptionsPane optionPane = new OptionsPane();
		frameOptionPane = optionPane.getOptionPane();
		mainFrame.getContentPane().add(frameOptionPane                                                               );

		//panel de input
		InputPane inputPane = new InputPane();
		frameInputPane = inputPane.getInputPane();
		mainFrame.getContentPane().add(frameInputPane);
		
		//panel de resultado
		OutputPane outputPane = new OutputPane();
		frameOutputPane = outputPane.getOutputPane();
		mainFrame.getContentPane().add(frameOutputPane);
		
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
	
	public static void main(String[]args) {
	MainGui maingui = new MainGui();/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));String s = br.readLine();*/
	} 
}
