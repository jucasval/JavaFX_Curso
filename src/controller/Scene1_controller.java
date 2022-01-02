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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;




public class Scene1_controller{
	
	
	@FXML
	private Label myLabel;
	@FXML
	private RadioButton rbt_pizza, rbt_sushi, rbt_burguer;
	
	
	public void getFood(ActionEvent event) {
		
		if(rbt_pizza.isSelected()) myLabel.setText(rbt_pizza.getText());
		else if(rbt_sushi.isSelected()) myLabel.setText(rbt_sushi.getText());
		else if(rbt_burguer.isSelected()) myLabel.setText(rbt_burguer.getText());
		
	}
	
	

}
