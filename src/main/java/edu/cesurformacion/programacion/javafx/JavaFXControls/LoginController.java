package edu.cesurformacion.programacion.javafx.JavaFXControls;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class LoginController {
	@FXML
	private TextField txtUserName;
	@FXML
	Label lblUserError;
	@FXML
	private PolygonController polygonController;
	private List<String> userNames;

	public LoginController() {
		userNames = Arrays.asList("user1", "user2", "user3", "USER4");
	}
	

	public void login() {

		if (!isUserNameValid()) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error de Inicio de Sesión");
			alert.setHeaderText(null);
			alert.setContentText("El nombre de usuario ingresado no existe.");
			alert.showAndWait();
			
			lblUserError.setText("El nombre de usuario ingresado no existe.");
			lblUserError.setTextFill(Color.RED);

			return;
		}

		try {
			FXMLLoader fxml = Inicio.getFXML("Polygon");
			Parent root = fxml.load();
			polygonController = fxml.getController();
			polygonController.displayUserName(txtUserName.getText());
			Inicio.setRoot(root);
		} catch (IOException e) {
			System.out.println("error al abrir pantalla polygon");
			// e.printStackTrace();
		}
	}

	private boolean isUserNameValid() {		
		return userNames.stream().anyMatch(u -> u.equals(txtUserName.getText()));
	}

}
