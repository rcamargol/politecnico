package co.edu.poli.vista;
	
import javax.swing.JOptionPane;

import javafx.stage.Stage;

public class Vista{
	
	private PanelJuego pj;
	
	public Vista(Stage primaryStage) {
		try {
			pj = new PanelJuego(primaryStage);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			//e.printStackTrace();
		}
	}
}