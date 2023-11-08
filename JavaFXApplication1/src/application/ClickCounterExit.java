package application;

import javax.swing.JOptionPane;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class ClickCounterExit extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	Stage stage;
	int iClickCount = 0;

	@Override
	public void start(Stage primaryStage) {
		stage = primaryStage;
// Create the Click Me button
		Button btnClickMe = new Button();
		btnClickMe.setText("Click me please!");
		btnClickMe.setOnAction(e -> btnClickMe_Click());
// Create the Close button ➝27
		Button btnClose = new Button();
		btnClose.setText("Close");
		btnClose.setOnAction(e -> btnClose_Click());
//Add the buttons to a layout pane
		VBox pane = new VBox(10);
		pane.getChildren().addAll(btnClickMe, btnClose);
		pane.setAlignment(Pos.CENTER);
//Add the layout pane to a scene
		Scene scene = new Scene(pane, 250, 150);
//Finish and show the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Click Counter");
		primaryStage.setOnCloseRequest(e -> {
			e.consume();
			btnClose_Click();
		});
		primaryStage.show();
	}

	public void btnClickMe_Click() {
		iClickCount++;
		if (iClickCount == 1) {
			JOptionPane.showMessageDialog(null, "You have clicked once. Click!");
			//MessageBox.show("You have clicked once.", "Click!");
		} else {
			JOptionPane.showMessageDialog(null, "You have clicked " + iClickCount + " times. Click!");
			//MessageBox.show("You have clicked " + iClickCount + " times.", "Click!");
		}
	}

	public void btnClose_Click() {
		String confirm = "N";
		//confirm = ConfirmationBox.show("Are you sure you want to quit?", "Confirmation", "Yes", "No");
		confirm = JOptionPane.showInputDialog(null, "Are you sure you want to quit?");
		if (confirm.equals("Y")) {
//Place any code needed to save files or
//close resources here.
			stage.close();
		}
	}
}