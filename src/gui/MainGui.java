package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import inputPkg.DescomposicionPrimos;

/**
 *Ventana principal donde se van a añadir los componentes de la GUI
 * */
@SuppressWarnings({ "serial", "unused" })
public class MainGui extends JFrame{
	public JFrame mainFrame;
	public static JPanel inputPane;
	
	public MainGui () {
		setContentPane(getContentPane());
		mainFrame = new JFrame("Calculator 2000");
		mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainFrame.setBounds(0, 0, 1080, 720);		
		mainFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 20));
		
		//panel de opciones
		OptionsPane optionPane = new OptionsPane();
		mainFrame.getContentPane().add(optionPane.getOptionPane());

		//panel de input
		inputPane = new InputPane();
		mainFrame.getContentPane().add(inputPane);
		
		//panel de resultado
		OutputPane outputPane = new OutputPane();
		mainFrame.getContentPane().add(outputPane.getOutputPane());
		
		
		mainFrame.setVisible(true);
	}
	
	public static void main(String[]args) {
	MainGui maingui = new MainGui();/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));String s = br.readLine();*/
	} 
}
