package co.edu.poli.vista;

import javax.swing.JOptionPane;

import co.edu.poli.modelo.Juego;
import javafx.event.EventHandler;
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

public class PanelJuego {
	
	private TextField txtNumeros;
	private TextField txtPicas;
	private TextField txtFijas;
	private Label lblNumeros;
	private Label lblNumIntentos;
	private Label lblPicas;
	private Label lblFijas;
	
	private Juego juego;
	
	private String intentos;
	private static int numIntentos;
	
	public PanelJuego(Stage primaryStage, EventHandler e) {
		try {
			BorderPane root = new BorderPane();
			juego = new Juego();
			juego.generarMagico();
			this.intentos = "Numero Intentos: " + numIntentos;
			lblNumIntentos = new Label(intentos);
			lblNumIntentos.setMinWidth(100);
			lblNumIntentos.setAlignment(Pos.BOTTOM_RIGHT);

			lblNumeros = new Label("Digita un número 4 dígitos:");
			lblNumeros.setMinWidth(100);
			lblNumeros.setAlignment(Pos.BOTTOM_RIGHT);
			txtNumeros = new TextField();
			txtNumeros.setMinWidth(200);
			txtNumeros.setMaxWidth(200);
			
			lblPicas = new Label("Picas:");
			lblPicas.setMinWidth(100);
			lblPicas.setAlignment(Pos.BOTTOM_RIGHT);
			txtPicas = new TextField();
			txtPicas.setMinWidth(200);
			txtPicas.setMaxWidth(200);
			txtPicas.setEditable(false);
			
			lblFijas = new Label("Fijas:");
			lblFijas.setMinWidth(100);
			lblFijas.setAlignment(Pos.BOTTOM_RIGHT);
			txtFijas = new TextField();
			txtFijas.setMinWidth(200);
			txtFijas.setMaxWidth(200);
			txtFijas.setEditable(false);
			
			txtNumeros.setPromptText("Escribe duatro digitos.");
			Button btnOK = new Button("Jugar");
			btnOK.setMinWidth(75);
			btnOK.setOnAction(e -> btnOK_Click());

			// asignación de objetos gráficos al grid
			HBox paneIntentos = new HBox(10, lblNumIntentos);
			paneIntentos.setPadding(new Insets(10));
			HBox paneCharacter = new HBox(10, lblNumeros, txtNumeros);
			paneCharacter.setPadding(new Insets(10));
			
			HBox panePicas = new HBox(10, lblPicas, txtPicas);
			panePicas.setPadding(new Insets(10));

			HBox paneFijas = new HBox(10, lblFijas, txtFijas);
			paneFijas.setPadding(new Insets(10));
			
			HBox paneButton = new HBox(20, btnOK);
			paneButton.setPadding(new Insets(10));
			paneButton.setAlignment(Pos.BOTTOM_RIGHT);
			VBox pane = new VBox(10, paneIntentos, paneCharacter,panePicas, paneFijas, paneButton);
			Scene scene = new Scene(pane);
			primaryStage.setTitle("Picas y Fijas: El Juego");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			//e.printStackTrace();
		}
	}
	

}
