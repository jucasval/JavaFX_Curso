package controller;




import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Label;
import javafx.scene.control.Slider;




public class Scene1_controller implements Initializable{
	
	/*
	 * SceneBuilder no me permite crear el evento para cuando cambia la posición del Slider, así pues que lo haremos con código.
	 * 
	 * Para ello implementamos la interfaz Initializable y dentro del método initialize crearemos el evento que necesitamos para 
	 * el Slider.
	 * */
	
	@FXML
	private Label myLabel;
	@FXML
	private Slider mySlider; 
	
	int temp;
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		myLabel.setText((int)mySlider.getValue() + " ºC");
		
		mySlider.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {				
				
				temp = (int)mySlider.getValue();
				
				myLabel.setText(temp + " ºC");
			}
			
		});
		
	}

	
	
	

}
