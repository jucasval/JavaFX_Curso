package controller;




import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;



public class Scene1_controller implements Initializable{
	
	/*
	 * Desafortunadamente, SceneBuilder no me da la opción de crear items para el objeto ChoiceBox, así que tenemos que hacerlo
	 * con código.
	 * 
	 * Tampoco me permite crear el evento onAction, así que lo crearemos también con código.
	 * 
	 * Para ello tendremos que implementar la interface Initializable
	 * */
	
	@FXML
	private ChoiceBox<String> myChoiceBox;
	@FXML
	private Label myLabel;
	
	private String[] food = {"pizza", "sushi", "burguer"};
	
	public void getFood(ActionEvent event) {
		
		String myFood = myChoiceBox.getValue();
		myLabel.setText(myFood);
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		//inicializamos los items de nuestro ChoiceBox
		myChoiceBox.getItems().addAll(food);
		myChoiceBox.setOnAction(this::getFood); //CREAMO EL EVENTO onAction
		
	}
	
	

}
