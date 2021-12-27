package curso;






import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LayoutsGridPane extends Application {

	public void addPreferDimensionButton(Button btn, int width, int height) {
		btn.setPrefWidth(width);
		btn.setPrefHeight(height);
	}
	
	public void addMaxDimensionButton(Button btn) {
		btn.setMaxWidth(Double.MAX_VALUE);
		btn.setMaxHeight(Double.MAX_VALUE);
	}
	
	
	
	@Override
	public void start(Stage primaryStage){
		
		TextField tfDisplay = new TextField();
		
		Button btn0 = new Button("0");
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		Button btn3 = new Button("3");
		Button btn4 = new Button("4");
		Button btn5 = new Button("5");
		Button btn6 = new Button("6");
		Button btn7 = new Button("7");
		Button btn8 = new Button("8");
		Button btn9 = new Button("9");
		
		Button btnSuma = new Button("+");
		Button btnResta = new Button("-");
		Button btnMultiplicacion = new Button("X");
		Button btnDivision = new Button("/");
		
		Button btnIgual = new Button("=");
		Button btnBorrar = new Button("C");
		
		GridPane gridpane = new GridPane();
		
		//FILA 0
		GridPane.setConstraints(tfDisplay, 0, 0, 4, 1);
		
		//FILA 1
		GridPane.setConstraints(btn7, 0, 1);
		GridPane.setConstraints(btn8, 1, 1);
		GridPane.setConstraints(btn9, 2, 1);
		GridPane.setConstraints(btnSuma, 3, 1);
		
		//FILA 2
		GridPane.setConstraints(btn4, 0, 2);
		GridPane.setConstraints(btn5, 1, 2);
		GridPane.setConstraints(btn6, 2, 2);
		GridPane.setConstraints(btnResta, 3, 2);
		
		//FILA 3
		GridPane.setConstraints(btn1, 0, 3);
		GridPane.setConstraints(btn2, 1, 3);
		GridPane.setConstraints(btn3, 2, 3);
		GridPane.setConstraints(btnMultiplicacion, 3, 3);
		
		//FILA 4
		GridPane.setConstraints(btnBorrar, 0, 4);
		GridPane.setConstraints(btn0, 1, 4);
		GridPane.setConstraints(btnIgual, 2, 4);
		GridPane.setConstraints(btnDivision, 3, 4);
		
		//DIMENSION PREDEFINIDA Y MÁXIMA NODOS HIJOS
		tfDisplay.setMaxWidth(Double.MAX_VALUE);
		tfDisplay.setMaxHeight(Double.MAX_VALUE);
		tfDisplay.setPrefHeight(35);
		
		addPreferDimensionButton(btn0, 55, 35);
		addPreferDimensionButton(btn1, 55, 35);
		addPreferDimensionButton(btn2, 55, 35);
		addPreferDimensionButton(btn3, 55, 35);
		addPreferDimensionButton(btn4, 55, 35);
		addPreferDimensionButton(btn5, 55, 35);
		addPreferDimensionButton(btn6, 55, 35);
		addPreferDimensionButton(btn7, 55, 35);
		addPreferDimensionButton(btn8, 55, 35);
		addPreferDimensionButton(btn9, 55, 35);
		addPreferDimensionButton(btnSuma, 55, 35);
		addPreferDimensionButton(btnResta, 55, 35);
		addPreferDimensionButton(btnMultiplicacion, 55, 35);
		addPreferDimensionButton(btnDivision, 55, 35);
		addPreferDimensionButton(btnIgual, 55, 35);
		addPreferDimensionButton(btnBorrar, 55, 35);
		
		GridPane.setVgrow(tfDisplay, Priority.ALWAYS);
		GridPane.setVgrow(btn7, Priority.ALWAYS);
		GridPane.setVgrow(btn4, Priority.ALWAYS);
		GridPane.setVgrow(btn1, Priority.ALWAYS);
		GridPane.setVgrow(btnBorrar, Priority.ALWAYS);
		
		GridPane.setHgrow(btn7, Priority.ALWAYS);
		GridPane.setHgrow(btn8, Priority.ALWAYS);
		GridPane.setHgrow(btn9, Priority.ALWAYS);
		GridPane.setHgrow(btnSuma, Priority.ALWAYS);
		
		addMaxDimensionButton(btn0);
		addMaxDimensionButton(btn1);
		addMaxDimensionButton(btn2);
		addMaxDimensionButton(btn3);
		addMaxDimensionButton(btn4);
		addMaxDimensionButton(btn5);
		addMaxDimensionButton(btn6);
		addMaxDimensionButton(btn7);
		addMaxDimensionButton(btn8);
		addMaxDimensionButton(btn9);
		addMaxDimensionButton(btnSuma);
		addMaxDimensionButton(btnResta);
		addMaxDimensionButton(btnMultiplicacion);
		addMaxDimensionButton(btnDivision);
		addMaxDimensionButton(btnIgual);
		addMaxDimensionButton(btnBorrar);
		
		gridpane.setAlignment(Pos.CENTER);
		gridpane.setHgap(5);
		gridpane.setVgap(5);
		
	
		
		gridpane.getChildren().addAll(btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, 
				btnSuma, btnResta, btnMultiplicacion, btnDivision, btnIgual, btnBorrar, tfDisplay);
		
		StackPane.setMargin(gridpane, new Insets(10));
		StackPane root = new StackPane(gridpane);
		
		Scene scene = new Scene(root, 300, 250);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculadora - GridPane - Layout");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
}
