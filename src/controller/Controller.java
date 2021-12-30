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
import javafx.scene.shape.Circle;


public class Controller implements Initializable{
	
	@FXML
	private Circle circle;
	private double x;
	private double y;
	
	public void arriba(ActionEvent e) {
		//System.out.println("Arriba");
		circle.setCenterY(y-=10);
	}
	
	public void abajo(ActionEvent e) {
		//System.out.println("Abajo");
		circle.setCenterY(y+=10);
	}
	
	public void derecha(ActionEvent e) {
		//System.out.println("Derecha");
		circle.setCenterX(x+=10);
	}
	
	public void izquierda(ActionEvent e) {
		//System.out.println("Izquierda");
		circle.setCenterX(x-=10);
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
		
	}

}
