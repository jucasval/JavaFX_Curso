package curso;

import java.io.IOException;


import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;


import javafx.scene.layout.FlowPane;

import javafx.stage.Stage;

public class LayoutsFlowPane extends Application {

	//Se puede decir que el layout FlowPane es una combinación del HBox y el VBox. Es decir, puede organizar los
	//comoponentes tanto de manera vertical como de manera horizontal.
	
	//Prodriamos decir que se podría comparar con una matriz de n filas x m columnas.
	
	

	private Button btn[] = new Button[15];
	
	
	@Override
	public void start(Stage primaryStage){
		
		
		
		
		FlowPane root = new FlowPane();
		root.setOrientation(Orientation.HORIZONTAL);
		root.setHgap(10);
		root.setVgap(10);
		
		for(int i = 0; i < btn.length; i++) {
			
			btn[i] = new Button("BOTÓN # " + (i + 1));
			root.getChildren().add(btn[i]);
		}
		
		
		Scene scene = new Scene(root, 300, 250);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("FlowPane - Layout");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
}
