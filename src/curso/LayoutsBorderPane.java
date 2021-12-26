package curso;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LayoutsBorderPane extends Application {

	//El layout BorderPane de JavaFX es equivlente al BorderLayout de Javax.Swing.
	//Se generan 5 regiones: North, South, Center, East y West
	
	Button btn1, btn2, btn3, btn4, btn5;
	
	
	@Override
	public void start(Stage primaryStage) throws IOException {	
		
		btn1 = new Button("NORTE");
		btn2 = new Button("SUR");
		btn3 = new Button("CENTRO");
		btn4 = new Button("IZQUIERDA");
		btn5 = new Button("DERECHA");
		
		BorderPane root = new BorderPane();//CREAMOS LA LÁMINA DE TIPO BorderPane
		
		//Colocamos los botones en nuestra lámina en sus correspondientes posiciones
		root.setCenter(btn3);
		//Expandimos los botones a lo ancho y largo del contenedor
		btn3.setMaxWidth(Double.MAX_VALUE);
		btn3.setMaxHeight(Double.MAX_VALUE);
		
		BorderPane.setMargin(btn3, new Insets(5, 5, 5, 5));  //Márgenes del botón CENTRO
		
		//Colocamos los botones en nuestra lámina en sus correspondientes posiciones
		root.setTop(btn1);
		//Expandimos los botones a lo ancho y largo del contenedor
		btn1.setMaxWidth(Double.MAX_VALUE);
		btn1.setMaxHeight(Double.MAX_VALUE);
		
		//Colocamos los botones en nuestra lámina en sus correspondientes posiciones
		root.setBottom(btn2);
		//Expandimos los botones a lo ancho y largo del contenedor
		btn2.setMaxWidth(Double.MAX_VALUE);
		btn2.setMaxHeight(Double.MAX_VALUE);
		
		//Colocamos los botones en nuestra lámina en sus correspondientes posiciones
		root.setRight(btn5);
		//Expandimos los botones a lo ancho y largo del contenedor
		btn5.setMaxWidth(Double.MAX_VALUE);
		btn5.setMaxHeight(Double.MAX_VALUE);
		
		BorderPane.setMargin(btn5, new Insets(5, 0, 5, 0));	//Márgenes del botón DERECHA
		
		//Colocamos los botones en nuestra lámina en sus correspondientes posiciones
		root.setLeft(btn4);
		//Expandimos los botones a lo ancho y largo del contenedor
		btn4.setMaxWidth(Double.MAX_VALUE);
		btn4.setMaxHeight(Double.MAX_VALUE);
		
		BorderPane.setMargin(btn4, new Insets(5, 0, 5, 0));	//Márgenes del botón IZQUIERDA
		
		Scene scene = new Scene(root, 300, 275);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Layout - BorderPane");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
}
