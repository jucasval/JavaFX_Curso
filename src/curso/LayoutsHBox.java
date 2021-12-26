package curso;

import java.io.IOException;
import java.io.InputStream;

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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LayoutsHBox extends Application {

	//El layout HBox (vertical box) organiza los componentes o nodos uno al lado del otro.
	
	private TextField tfUser;
	private PasswordField pfPass;
	private Button btnLogin;
	
	private ImageView imageLogo;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		//Nos creamos 2 layout de tipo VBox
		VBox containerIzquierda = new VBox();
		VBox containerDerecha = new VBox();
		
		Label lbLogin = new Label("Iniciar Sesión");
		lbLogin.setFont(new Font(40));
		
		//Nos creaamos un contenedor para los campos del login que despues colocaremos en el VBox izquierda
		VBox containerLogin = new VBox();
		
		Label lbUser = new Label("Usuario");
		lbUser.setFont(new Font(20));
		
		
		Label lbPass = new Label("Contraseña");
		lbPass.setFont(new Font(20));
		
		tfUser = new TextField();
		tfUser.setFont(new Font(18));
		tfUser.setPromptText("Ingrese su usuario");
		tfUser.setPrefWidth(341);
		tfUser.setPrefHeight(44);
		
		pfPass = new PasswordField();
		pfPass.setFont(new Font(18));
		pfPass.setPromptText("Ingrese su contraseña");
		pfPass.setPrefWidth(341);
		pfPass.setPrefHeight(44);
		
		
		btnLogin = new Button("Entrar");
		btnLogin.setFont(new Font(20));
		btnLogin.setPrefWidth(370);
		btnLogin.setPrefHeight(44);
		btnLogin.setMaxWidth(Double.MAX_VALUE);
		btnLogin.setCursor(Cursor.HAND);
		
		//Agregamos los componentes al contenedor containerLogin		
		  containerLogin.getChildren().addAll(lbUser, tfUser, lbPass, pfPass, btnLogin);
		  containerLogin.setAlignment(Pos.CENTER);//alineamos todos los componentes al centro	
		
		  VBox.setMargin(lbUser, new Insets(10, 0, 0, 0)); 
		  VBox.setMargin(lbPass, new Insets(10, 0, 0, 0)); 
		  VBox.setMargin(btnLogin, new Insets(20, 0, 0, 0));
		 
		  //Agregamos los componentes al layout VBox izquierda
		  containerIzquierda.getChildren().addAll(lbLogin, containerLogin);
		  containerIzquierda.setPrefWidth(422);
		  containerIzquierda.setAlignment(Pos.CENTER);
		  VBox.setMargin(containerLogin, new Insets(40, 30, 0, 30));
		  
		  //AGREGAMOS COMPONENTES AL ContainerDerecha (realmente sólo damos un fondo de pantalla)
		  
		  containerDerecha.setPrefWidth(422);
		  containerDerecha.setAlignment(Pos.CENTER);
		  containerDerecha.setBackground(new Background(new BackgroundFill(Color.web("#30373e"),CornerRadii.EMPTY, Insets.EMPTY)));
		
		HBox root = new HBox();//CREAMOS LA LÁMINA DE TIPO HBox
		root.getChildren().addAll(containerIzquierda, containerDerecha);
		
		HBox.setHgrow(containerIzquierda, Priority.ALWAYS);//redimensionamos los componentes de la izquierda siempre
		
		Scene scene = new Scene(root, 854, 503);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("HBox - Layout");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
}
