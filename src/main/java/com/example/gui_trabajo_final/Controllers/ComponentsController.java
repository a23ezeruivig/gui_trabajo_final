package com.example.gui_trabajo_final.Controllers;
import java.sql.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ComponentsController {
    @FXML TextField fieldName;
    @FXML TextField fieldColor;
    @FXML TextField fieldPercentage;
    @FXML TextField fieldPrice;
    @FXML TextField fieldIdRemove;

    @FXML public void switchToMenu(ActionEvent event)  {
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
            System.out.println("Error at switching scene from 'components' to 'menu'");
        }
    }

    @FXML public void addComponent() {
        String url = "jdbc:mysql://127.0.0.1:3306/proyectofinal";
        String user = "root";
        String password = "root";
        String query = "INSERT INTO components (name, color, percentage, price) VALUES (?, ?, ?, ?)";

        String name = String.valueOf(fieldName.getText());
        String color = String.valueOf(fieldColor.getText());
        String percentage = String.valueOf(fieldPercentage.getText());
        String price = String.valueOf(fieldPrice.getText());

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, color);
            preparedStatement.setString(3, percentage);
            preparedStatement.setString(4, price);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error at communicating to DB");
        }
    }

    @FXML public void removeComponent() {
        String url = "jdbc:mysql://127.0.0.1:3306/proyectofinal";
        String user = "root";
        String password = "root";
        String query = "DELETE FROM components WHERE id = ?";

        String tmp = String.valueOf(fieldIdRemove.getText());
        int id = Integer.parseInt(tmp);

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error at communicating to DB");
        }
    }
}
