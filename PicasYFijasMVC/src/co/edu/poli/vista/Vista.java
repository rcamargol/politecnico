package co.edu.poli.vista;
	
import javax.swing.JOptionPane;

import co.edu.poli.controlador.Main;
import javafx.stage.Stage;

public class Vista{
	
	private PanelJuego pj;
	
	public Vista(Stage primaryStage, Main controlador) {
		try {
			pj = new PanelJuego(primaryStage, controlador);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			//e.printStackTrace();
		}
	}
	
	public void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public PanelJuego getPj() {
		return pj;
	}

	public void setPj(PanelJuego pj) {
		this.pj = pj;
	}
	
	
}