package edu.cesurformacion.programacion.javafx.JavaFXControls;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class PrimaryController {
	
	@FXML
	private Polygon figTriangle = new Polygon();

    @FXML
    private void switchToSecondary(ActionEvent e) throws IOException {
        Inicio.setRoot("secondary");
    }
    
    public void changeTriangleColor(ActionEvent e) {
    	figTriangle.setFill(Color.RED);
    	
    }
}
