package curso;




import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LayoutsGridPane extends Application {

	//Se puede decir que el layout GridPane es como dividir nuestro marco en una hoja excel con sus correspondientes
	//celdas.
	
	/*
	 * El GridPane es un componente de diseño (Layout) que presenta sus componentes secundarios en una cuadrícula.
	 * El tamaño de las celdas en la cuadrícula depende de los componentes que se muestran ene el GridPane, pero 
	 * hay algunas reglas.
	 * 
	 * Todas las celdas de la misma fila tendrán la misma altura y todas las celdas de la misma columna tendrán el
	 * mismo ancho.
	 * 
	 * Diferentes filas pueden tener diferentes alturas y diferentes columnas pueden tener diferentes anchos.
	 * */
	
	
	
	@Override
	public void start(Stage primaryStage){
		
		
		Button btn1 = new Button("Botón # 1");
		Button btn2 = new Button("Botón # 2");
		Button btn3 = new Button("Botón # 3");
		Button btn4 = new Button("Botón # 4");
		Button btn5 = new Button("Botón # 5");
		Button btn6 = new Button("Botón # 6");
		
		GridPane root = new GridPane();
		
		//FILA 0
		
		//Agrego el btn1 a la columna 0, fila 0.
		GridPane.setColumnIndex(btn1, 0);
		GridPane.setRowIndex(btn1, 0);
		
		GridPane.setRowSpan(btn1, 2); //el botón 1 ocupará 2 columnas.
		btn1.setMaxHeight(Double.MAX_VALUE);
		
		//Otra forma de hacerlo. Agrego el btn2 a la columna 1, fila 0.
		GridPane.setConstraints(btn2, 1, 0, 2, 1);
		btn2.setMaxWidth(Double.MAX_VALUE);
		GridPane.setConstraints(btn3, 2, 0);
		
		//FILA 1
		GridPane.setConstraints(btn4, 0, 1);
		GridPane.setConstraints(btn5, 1, 1);
		GridPane.setConstraints(btn6, 2, 1);
		
		root.setHgap(10);
		root.setVgap(10);
		root.getChildren().addAll(btn1, btn2, btn5, btn6);
		
		Scene scene = new Scene(root, 300, 250);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("GridPane - Layout");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
}
