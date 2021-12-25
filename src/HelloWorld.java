
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {

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
}
