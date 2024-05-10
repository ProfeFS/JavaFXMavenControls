package edu.cesurformacion.programacion.javafx.JavaFXControls;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class LoginController {
	@FXML
	private TextField txtUserName;
	@FXML
	private PolygonController polygonController;
	
	public void login() {
		
		try {
			FXMLLoader fxml = Inicio.getFXML("Polygon");
			Parent root = fxml.load();
			polygonController = fxml.getController();
			polygonController.displayUserName(txtUserName.getText());
			Inicio.setRoot(root);
		} catch (IOException e) {
			System.out.println("error al abrir pantalla polygon");
			//e.printStackTrace();
		}
	}
	
	/*Método creando un nuevo scenario
	 *  FXMLLoader loader = new FXMLLoader(getClass().getResource("Polygon.fxml"));	
		root = loader.load();		
		polygonController = loader.getController();
		polygonController.displayUserName(txtUserName.getText());
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	 */

}
