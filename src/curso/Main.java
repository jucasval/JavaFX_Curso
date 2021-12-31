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
		
		//vinculamos nuestro css
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		stage.setScene(scene);
		stage.setTitle("Logout");
		stage.show();
		
		stage.setOnCloseRequest(event -> {
			
			event.consume();
			
			try {
				logout(stage);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
	}
	
	public void logout(Stage stage) throws IOException {
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("Estas a punto de desconectarte");
		alert.setContentText("¿Quieres guardar los cambios antes de salir?:");
		
		if(alert.showAndWait().get() == ButtonType.OK) {
			System.out.println("Te desconectaste correctamente");
			stage.close();
		}
		
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
}
