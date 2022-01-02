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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;




public class Scene1_controller{
	
	Image encendida = new Image(getClass().getResourceAsStream("/images/encendida.jpg"));
	Image apagada = new Image(getClass().getResourceAsStream("/images/apagada.png"));
	
	@FXML
	private Label myLabel;
	@FXML
	private ImageView myImageView;
	@FXML
	private CheckBox myCheckBox;
	
	
	
	public void change(ActionEvent event) {
		
		if(myCheckBox.isSelected()) {
			//System.out.println("ON");
			myLabel.setText("ON");
			myImageView.setImage(encendida);
		}else {
			//System.out.println("OFF");
			myLabel.setText("OFF");
			myImageView.setImage(apagada);
		}
		
	}
	
	
	

}
