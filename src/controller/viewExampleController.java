package controller;


import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;


public class viewExampleController implements Initializable{
	
	@FXML
	private Button btnAceptar;
	
	@FXML
	private TextField tf1, tf2, tf3, tf4;
	
	
	@FXML
	private void event_btnAceptar(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "Hola Mundo");
	}
	
	@FXML
	private void eventKey(KeyEvent event) {		
		
		if(event.getSource().equals(tf1)) {
					
			
			if(!Character.isLetter(event.getCharacter().charAt(0))) {
				event.consume();
				System.out.println(event.getSource());
			}
			
		}else if(event.getSource().equals(tf2)) {
			
			if(!Character.isDigit(event.getCharacter().charAt(0))) {
				event.consume();
			}
			
		}else if(event.getSource().equals(tf3)) {
			
			if(!Character.isDigit(event.getCharacter().charAt(0)) 
					&& !Character.isLetter(event.getCharacter().charAt(0))) {
				event.consume();
			}
			
			
		}else if(event.getSource().equals(tf4)) {
			
			if(tf4.getText().length()>8) {
				event.consume();
			}
			
		}
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
		
	}

}
