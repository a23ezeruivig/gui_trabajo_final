package com.example.gui_trabajo_final.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WorkersController {
    @FXML private TextField fieldDni;
    @FXML private TextField fieldName;
    @FXML private TextField fieldSurname;
    @FXML private TextField fieldRole;
    @FXML private TextField fieldSalary;
    @FXML private TextField fieldDniRemove;

    @FXML public void switchToMenu(ActionEvent event) {
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
            System.out.println("Error at switching scene from 'workers' to 'menu'");
        }
    }

    @FXML public void addWorker() {
        String url = "jdbc:mysql://127.0.0.1:3306/proyectofinal";
        String user = "root";
        String password = "root";
        String query = "INSERT INTO workers (dni, name, surname, role, salary) VALUES (?, ?, ?, ?, ?)";

        String dni = String.valueOf(fieldDni.getText());
        String name = String.valueOf(fieldName.getText());
        String surname = String.valueOf(fieldSurname.getText());
        String role = String.valueOf(fieldRole.getText());
        String salary = String.valueOf(fieldSalary.getText());

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, dni);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, surname);
            preparedStatement.setString(4, role);
            preparedStatement.setString(5, salary);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error at communicating to DB");
        }
    }

    @FXML public void removeWorker() {
        String url = "jdbc:mysql://127.0.0.1:3306/proyectofinal";
        String user = "root";
        String password = "root";
        String query = "DELETE FROM workers WHERE dni = ?";

        String dni = String.valueOf(fieldDniRemove.getText());

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, dni);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error at communicating to DB");
        }
    }
}
