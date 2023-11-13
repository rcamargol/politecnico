package co.edu.poli.vista;

import javax.swing.JOptionPane;

import co.edu.poli.controlador.Main;
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
	private Button btnOK; 
	
	private String intentos;
	private int numIntentos;
	
	public PanelJuego(Stage primaryStage, Main controlador) {
		this.numIntentos = 1;
		try {
			BorderPane root = new BorderPane();
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
			
			this.txtNumeros.setPromptText("Escribe duatro digitos.");
			this.btnOK = new Button("Jugar");
			this.btnOK.setMinWidth(75);
			//btnOK.setOnAction(e -> btnOK_Click());
			this.btnOK.setOnAction(controlador);
			// asignación de objetos gráficos al grid
			HBox paneIntentos = new HBox(10, lblNumIntentos);
			paneIntentos.setPadding(new Insets(10));
			HBox paneCharacter = new HBox(10, lblNumeros, txtNumeros);
			paneCharacter.setPadding(new Insets(10));
			
			HBox panePicas = new HBox(10, lblPicas, txtPicas);
			panePicas.setPadding(new Insets(10));

			HBox paneFijas = new HBox(10, lblFijas, txtFijas);
			paneFijas.setPadding(new Insets(10));
			
			HBox paneButton = new HBox(20, this.btnOK);
			paneButton.setPadding(new Insets(10));
			paneButton.setAlignment(Pos.BOTTOM_RIGHT);
			VBox pane = new VBox(10, paneIntentos, paneCharacter,panePicas, paneFijas, paneButton);
			Scene scene = new Scene(pane);
			primaryStage.setTitle("Picas y Fijas: El Juego");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
			//e.printStackTrace();
		}
	}
	
	// getters y setters
	
	public TextField getTxtNumeros() {
		return txtNumeros;
	}

	public void setTxtNumeros(TextField txtNumeros) {
		this.txtNumeros = txtNumeros;
	}

	public TextField getTxtPicas() {
		return txtPicas;
	}

	public void setTxtPicas(TextField txtPicas) {
		this.txtPicas = txtPicas;
	}

	public TextField getTxtFijas() {
		return txtFijas;
	}

	public void setTxtFijas(TextField txtFijas) {
		this.txtFijas = txtFijas;
	}

	public Label getLblNumeros() {
		return lblNumeros;
	}

	public void setLblNumeros(Label lblNumeros) {
		this.lblNumeros = lblNumeros;
	}

	public Label getLblNumIntentos() {
		return lblNumIntentos;
	}

	public void setLblNumIntentos(Label lblNumIntentos) {
		this.lblNumIntentos = lblNumIntentos;
	}

	public Label getLblPicas() {
		return lblPicas;
	}

	public void setLblPicas(Label lblPicas) {
		this.lblPicas = lblPicas;
	}

	public Label getLblFijas() {
		return lblFijas;
	}

	public void setLblFijas(Label lblFijas) {
		this.lblFijas = lblFijas;
	}

	public Button getBtnOK() {
		return btnOK;
	}

	public void setBtnOK(Button btnOK) {
		this.btnOK = btnOK;
	}

	public String getIntentos() {
		return intentos;
	}

	public void setIntentos(String intentos) {
		this.intentos = intentos;
	}

	public int getNumIntentos() {
		return numIntentos;
	}

	public void setNumIntentos(int numIntentos) {
		this.numIntentos = numIntentos;
	}
	
}
