package com.example.gui_trabajo_final;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("/com/example/gui_trabajo_final/login.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 640, 360);
            stage.setTitle("Login Menu");
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Error at initializing application");
        }
    }

    public static void main(String[] args) {
        launch();
    }
}