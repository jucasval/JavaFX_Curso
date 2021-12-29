package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class viewExampleController implements Initializable{
	
	@FXML
	private Button btnAceptar;
	
	@FXML
	private void event_btnAceptar(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "Hola Mundo");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
		
	}

}
