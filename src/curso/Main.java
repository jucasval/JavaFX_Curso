package curso;


import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class Main extends Application {

	
	
	
	@Override
	public void start(Stage stage) throws Exception{
		
	Parent root = FXMLLoader.load(getClass().getResource("/view/Scene1.fxml"));
		
		Scene scene = new Scene(root);
		
		//vinculamos nuestro css
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		stage.setScene(scene);
		stage.setTitle("Uso de Controladores");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
}
