package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
	
	static BorderPane root;

	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		try {
			root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			load();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void load() {
		HBox hbox = new HBox();
		Label label1 = new Label("Label 1");
		Label label2 = new Label("Label 2");
		Label label3 = new Label("Label 3");
		hbox.getChildren().add(label1);
		hbox.getChildren().add(label2);
		hbox.getChildren().add(label3);
		root.setTop(new Label("Hola Mundo!!"));
		root.setLeft(hbox);
		root.setRight(new Label("En la derecha"));
		root.setCenter(new Label("En el centro"));
		root.setBottom(new Label("En el fondo"));
	}
}
