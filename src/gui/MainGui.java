package gui;

import java.awt.FlowLayout;

import javax.swing.JFrame;

/**
 *Ventana principal donde se van a añadir los componentes de la GUI
 * */
@SuppressWarnings({ "serial", "unused" })
public class MainGui extends JFrame{
	private JFrame mainFrame;
	
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
		InputPane inputPane = new InputPane();
		System.out.println(optionPane.getOptionPane().getComponentCount());
		mainFrame.getContentPane().add(inputPane.getInputPane());
		
		//panel de resultado
		OutputPane outputPane = new OutputPane();
		mainFrame.getContentPane().add(outputPane.getOutputPane());
		
		
		mainFrame.setVisible(true);
	}
	public static void main(String[]args) {MainGui maingui = new MainGui();/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));String s = br.readLine();*/
	} 
}
