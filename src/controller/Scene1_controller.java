package controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;




public class Scene1_controller{
	
	
	
	@FXML
	private Button	btn_logout;
	
	@FXML
	private AnchorPane scenePane;
	
	private Stage stage;
	
	public void logout(ActionEvent e) throws IOException {
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("Estas a punto de desconectarte");
		alert.setContentText("¿Quieres guardar los cambios antes de salir?:");
		
		if(alert.showAndWait().get() == ButtonType.OK) {
			stage = (Stage) scenePane.getScene().getWindow();
			System.out.println("Te desconectaste correctamente");
			stage.close();
		}
		
		
		
	}
	
	
	

}
