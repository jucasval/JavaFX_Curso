package controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;




public class Controller implements Initializable{
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchToScene1(ActionEvent e) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/Scene1.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/curso/application.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToScene2(ActionEvent e) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/Scene2.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
		
	}

}
