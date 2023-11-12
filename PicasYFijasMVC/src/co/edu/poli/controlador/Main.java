package co.edu.poli.controlador;


import javax.swing.JOptionPane;
import co.edu.poli.vista.Vista;
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {

	//private PanelJuego pj;
	private Vista vista;
	
	public static void main(String[] args) {
		//numIntentos = 1;
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			vista = new Vista(primaryStage);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			//e.printStackTrace();
		}
	}
	
	public void btnLogica() {
		
	}
	
}
