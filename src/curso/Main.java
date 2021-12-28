package curso;








import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UsoFXML extends Application {

	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		
		Parent root = FXMLLoader.load(getClass().getResource("InterfazGrafica.fxml"));
		
		Scene scene = new Scene(root, 300, 250);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Uso de archivos FXML");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
}
