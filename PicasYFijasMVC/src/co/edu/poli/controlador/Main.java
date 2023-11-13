package co.edu.poli.controlador;


import javax.swing.JOptionPane;

import co.edu.poli.modelo.Juego;
import co.edu.poli.vista.Vista;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {

	private Vista vista;
	private Juego juego;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			vista = new Vista(primaryStage, this);
			juego = new Juego();
			juego.generarMagico();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			//e.printStackTrace();
		}
	}
	

	@Override
	public void handle(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == vista.getPj().getBtnOK()) {
			btnOK_Click();
		} 
	}
	
	public void btnOK_Click() {
		int numero = 0;
		boolean adivino = false, norepetido = false;
		String numtext = vista.getPj().getTxtNumeros().getText();
		numero = juego.validarEntrada(numtext);
		norepetido = juego.validarRepetido(numero);
		if (numero > 0  && norepetido) {
			adivino = juego.adivinaste();
			if (!adivino && vista.getPj().getNumIntentos() < juego.MAX_INTENTOS) {
				vista.getPj().getTxtPicas().setText(juego.getTxpicas());
				vista.getPj().getTxtFijas().setText(juego.getTxfijas());
				vista.getPj().setNumIntentos(vista.getPj().getNumIntentos()+1); 
				vista.getPj().setIntentos("Numero Intentos: " + vista.getPj().getNumIntentos()); 
				vista.getPj().getLblNumIntentos().setText(vista.getPj().getIntentos()); 
				vista.getPj().getTxtNumeros().setText(""); 
			}
			else {
				if (adivino) {
					JOptionPane.showMessageDialog(null, "¡GANASTE!");
				}
				else if (vista.getPj().getNumIntentos() == juego.MAX_INTENTOS)
					JOptionPane.showMessageDialog(null, "¡PERDISTE!, el número es: "+juego.getMagicoTxt());
			}
		}
		else {
			if(numero == juego.ERRORDIGITOS)
				JOptionPane.showMessageDialog(null, "Se requieren cuatro dígitos");
			else if(numero == juego.ENTRADAINVALIDA)
				JOptionPane.showMessageDialog(null, "Entrada inválida");
			else if(!norepetido)
				JOptionPane.showMessageDialog(null,"Hay Dígitos Repetidos");
			vista.getPj().getTxtNumeros().requestFocus();
		}
	}
	
}
