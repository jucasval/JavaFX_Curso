package curso;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LayoutsVBox extends Application {

	//El layout VBox (vertical box) organiza los componentes o nodos uno debajo del otro.
	
	private TextField tfUser;
	private PasswordField pfPass;
	private Button btnLogin;
	
	@Override
	public void start(Stage primaryStage) throws IOException {			
		
		Label lbLogin = new Label("Login");
		lbLogin.setFont(new Font(30));//Cambiamos el tamaño del label
		
		
		Label lbUser = new Label("Usuario");
		lbUser.setFont(new Font(15));//Cambiamos el tamaño del label
		
		
		Label lbPass = new Label("Contraseña");
		lbPass.setFont(new Font(15));//Cambiamos el tamaño del label
		
		tfUser = new TextField();
		tfUser.setMaxWidth(150);//asignamos un tamaño horizontal fijo
		
		pfPass = new PasswordField();
		pfPass.setMaxWidth(150);//asignamos un tamaño horizontal fijo
		
		
		btnLogin = new Button("Entrar");
		btnLogin.setMaxWidth(150);//asignamos un tamaño horizontal fijo
		btnLogin.setCursor(Cursor.HAND);//Convertimos el cursor en una mano cuando pasa por encima del botón
		
		VBox root = new VBox();//CREAMOS LA LÁMINA DE TIPO VBox
		
		//agreagamos todos nuestros nodos de una vez. Aparecerán siguiendo el orden en que se agregan
		root.getChildren().addAll(lbLogin, lbUser, tfUser, lbPass, pfPass, btnLogin);
		root.setAlignment(Pos.CENTER);//alineamos todos los componentes al centro
		
		//Aplicamos márgenes
		VBox.setMargin(lbUser, new Insets(10, 0, 0, 0));
		VBox.setMargin(lbPass, new Insets(10, 0, 0, 0));
		VBox.setMargin(btnLogin, new Insets(10, 0, 0, 0));
		
		Scene scene = new Scene(root, 300, 275);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("VBox - BorderPane");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
}
