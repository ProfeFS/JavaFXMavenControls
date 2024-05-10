package edu.cesurformacion.programacion.javafx.JavaFXControls;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class Inicio extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("Login"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }
    
    static void setRoot(Parent root) throws IOException {
        scene.setRoot(root);
    }

    public static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Inicio.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
    
    public static FXMLLoader getFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Inicio.class.getResource(fxml + ".fxml"));
        return fxmlLoader;
    }

    public static void main(String[] args) {
        launch();
    }

}