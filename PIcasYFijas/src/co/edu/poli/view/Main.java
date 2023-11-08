package co.edu.poli.view;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Main extends Application {

	private TextField txtNumeros;
	private TextField txtPicas;
	private TextField txtFijas;
	private Label lblNumeros;
	private Label lblNumIntentos;
	private Label lblPicas;
	private Label lblFijas;
	private String intentos;
	private static int numIntentos;
	private int[] adivina;
	private int[] magico;
	private int picas;
	private int fijas;

	public static void main(String[] args) {
		numIntentos = 1;
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			generarMagico();
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
			Button btnOK = new Button("OK");
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
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void btnOK_Click() {
		int numero = 0;
		boolean adivino = false;
		if (validarEntrada() != 0 && validarRepetido(validarEntrada())) {
			//JOptionPane.showMessageDialog(null, "Número correcto");
			adivino = adivinaste();
			if (!adivino && this.numIntentos < 10) {
				this.numIntentos++;
				intentos = "Numero Intentos: " + numIntentos;
				lblNumIntentos.setText(intentos);
				txtNumeros.setText(""); 
			}
			else {
				if (adivino) {
					JOptionPane.showMessageDialog(null, "¡GANASTE!");
				}
				else if (this.numIntentos == 10)
					JOptionPane.showMessageDialog(null, "¡PERDISTE!");
			}
		}

	}

	public void generarMagico() {
		this.magico = new int[4];
		int[] digitos = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int numero;
		double num;
		int total = 0;
		while (total < 4) {
			num = Math.random() * 10;
			numero = (int) num;
			if (digitos[numero] != -1) {
				this.magico[total] = numero;
				digitos[numero] = -1;
				total++;
				System.out.print(numero+" ");
			}
			//System.out.println("magico:"+this.magico[total]);
		}
	}

	public int validarEntrada() {
		int numero = 0;
		if (txtNumeros.getText().length() != 4) {
			JOptionPane.showMessageDialog(null, "Se requieren cuatro dígitos");
			txtNumeros.requestFocus();
		} else {
			try {
				numero = Integer.parseInt(txtNumeros.getText());
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Entrada inválida");
				txtNumeros.requestFocus();
			}

		}
		return numero;
	}

	public boolean validarRepetido(int numero) {
		this.adivina = new int[4];
		int[] digitos = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int i = 0, num = numero, j = 3;
		while (num > 0) {
			this.adivina[j] = num % 10;
			//System.out.println(this.adivina[j]);
			num = num / 10;
			j--;
		}
		for (i = 0; i < 4; i++) {
			if (digitos[this.adivina[i]] != -1)
				digitos[this.adivina[i]] = -1;
			else {
				JOptionPane.showMessageDialog(null,"Dígito Repetido");
				txtNumeros.requestFocus();
				return false;
			}
		}
		return true;
	}

	public boolean adivinaste() {
		boolean adivina = false;
		int i,j;
		this.picas = this.fijas = 0;
		for(i = 0 ; i < 4 ; i++ ) {
			if (this.adivina[i] == this.magico[i])
				this.fijas++;
		}
		for(i = 0 ; i < 4 ; i++) {
			for (j = 0 ; j < 4 ; j++) {
				if (i != j && this.adivina[i] == this.magico[j])
					this.picas++;
			}
		}
		if (this.fijas == 4)
			adivina = true;
		String txpicas = this.picas+"";
		String txfijas = this.fijas+"";
		txtPicas.setText(txpicas);
		txtFijas.setText(txfijas);
		//System.out.println("Picas:"+this.picas+"-- Fijas:"+this.fijas);
		return adivina;
	}
	
}
