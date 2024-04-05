module PicasYFijasMVC {
	requires javafx.controls;
	requires java.desktop;
	requires javafx.base;
	
	opens co.edu.poli.vista to javafx.graphics, javafx.fxml;
	opens co.edu.poli.controlador to javafx.graphics, javafx.fxml;
}
