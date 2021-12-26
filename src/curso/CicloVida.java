package curso;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CicloVida extends Application {

	
	
	public CicloVida() {
		System.out.println("método constructor");
	}

	@Override
	public void init() {
		/*
		El método init() se ejecuta siempre a continuación de la creación de un objeto de la clase Application
		Este método se utiliza para realizar algunos trabajos específicos. 
		Ejemmplo:
		 * una validación con una base de datos
		 * carga inicial de una configuración específica de un programa
		 * etc...
		*/
		
		System.out.println("Método init()");
		
		
	}
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		Label label = new Label("Hola mundo");
		StackPane root = new StackPane();
		
		root.getChildren().add(label);
		
		
		
		Scene scene = new Scene(root, 300, 275);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("JAVAFX 1");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void stop() {
		//Se ejecuta al finalizar la aplicación. Por ejemplo, cerrar una base de datos.
		System.out.println("Se ha termninado la ejecución de la aplicación");
	}
}
