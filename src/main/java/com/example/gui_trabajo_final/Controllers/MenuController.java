package com.example.gui_trabajo_final.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {
    @FXML public void switchToLogin(ActionEvent event)  {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/gui_trabajo_final/login.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setTitle("Login Menu");
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e) {
            System.out.println("Error at switching scene from 'menu' to 'login'");
            e.printStackTrace();
        }
    }

    @FXML public void switchToWorkers(ActionEvent event)  {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/gui_trabajo_final/workers.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setTitle("Management of Workers");
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e) {
            System.out.println("Error at switching scene from 'menu' to 'workers'");
            e.printStackTrace();
        }
    }

    @FXML public void switchToComponents(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/gui_trabajo_final/components.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setTitle("Management of Components");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.out.println("Error at switching scene from 'menu' to 'components'");
            e.printStackTrace();
        }
    }
}
