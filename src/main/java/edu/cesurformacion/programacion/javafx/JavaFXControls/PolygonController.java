package edu.cesurformacion.programacion.javafx.JavaFXControls;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class PolygonController {
	
	@FXML
	private Polygon figTriangle;	
	@FXML
	private Label lblUserName;
	private Color originalTriangleColor;
	
	
	@FXML
	private void initialize() {
		originalTriangleColor = (Color) figTriangle.getFill();
	}
	
	public void changeTriangleColor() {
		figTriangle.setFill(Color.RED);		
	}
	
	public void restoreTriangleColor() {
		figTriangle.setFill(originalTriangleColor);
	}
	
	public void showPrimary(ActionEvent e) {
		try {
			Inicio.setRoot("primary");
		} catch (IOException e1) {
			System.out.println("Error al abrir scena primary");
			e1.printStackTrace();
		}
	}
	
	public void displayUserName(String userName) {
		lblUserName.setText(userName);
	}
	


}
