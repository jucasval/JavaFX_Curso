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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;




public class Scene1_controller{
	
	int edad;
	
	@FXML	
	private Label lbEdad;
	
	@FXML
	private Button btnEnviar;
	
	@FXML
	private TextField txtEdad;
	
	public void enviarEdad(ActionEvent event) {
		
		try {
			
			edad = Integer.parseInt(txtEdad.getText());
			System.out.println(edad);
			
			if(edad >= 18) lbEdad.setText("Enhorabuena, estás conectado !!!");
			else lbEdad.setText("Debes ser 18+ para poder conectarte");
		
		} catch (NumberFormatException nfe) {
			System.out.println("Introduzca una edad correcta, please");
			txtEdad.setText("");
			lbEdad.setText("Introduzca una edad correcta, please");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			lbEdad.setText("Error");
		}
		
	}

}
