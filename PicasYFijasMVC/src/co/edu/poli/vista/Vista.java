package co.edu.poli.vista;
	
import javax.swing.JOptionPane;

import co.edu.poli.modelo.Juego;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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