package curso;


import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Main extends Application {

	
	
	
	@Override
	public void start(Stage stage) throws Exception{
		
	Parent root = FXMLLoader.load(getClass().getResource("/view/Scene1.fxml"));
		
		Scene scene = new Scene(root);	
		
		
		stage.setScene(scene);
		stage.setTitle("Logout");
		stage.show();
		
		
	}
	
	

	public static void main(String[] args) {
		launch(args);
	}
	
	
}
