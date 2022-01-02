package controller;




import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;



public class Scene1_controller{
	
	
	@FXML
	private AnchorPane myPane;
	@FXML
	private ColorPicker myColorPicker;
	
	
	public void changeColor(ActionEvent event) {
		
		Color miColor = myColorPicker.getValue();
		myPane.setBackground(new Background(new BackgroundFill(miColor, null, null)));
		
	}
	
	

}
