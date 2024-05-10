package edu.cesurformacion.programacion.javafx.JavaFXControls;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        Inicio.setRoot("primary");
    }
}