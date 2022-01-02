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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;




public class Scene1_controller{
	
	//ImageView es un nodo para pintar imagenes cargadas con la clase Images
	
	//Image = photograph
	
	//ImageView = marco para la imagen
	
	@FXML
	private ImageView myImageView;
	private Button myButton;
	
	Image myImage = new Image(getClass().getResourceAsStream("/images/foto2.jpg"));	
	
	public void displayImage() {
		myImageView.setImage(myImage);
	}
	
	
	

}
