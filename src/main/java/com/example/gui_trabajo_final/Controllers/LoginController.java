package com.example.gui_trabajo_final.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;


public class LoginController {
    @FXML private Label errorAtLogin;
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;

    @FXML public void tryLogin(ActionEvent event) {
        String username = String.valueOf(usernameField.getText());
        String password = String.valueOf(passwordField.getText());
        if (username.equals("root") && password.equals("root")) {
            switchToMenu(event);
        } else
            errorAtLogin.setVisible(true);
    }

    @FXML private void switchToMenu(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/gui_trabajo_final/menu.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setTitle("Main Menu");
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error at switching scene from 'login' to 'menu'");
        }
    }
}