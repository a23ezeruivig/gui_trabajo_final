module com.example.gui_trabajo_final {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.gui_trabajo_final to javafx.fxml;
    exports com.example.gui_trabajo_final;
    exports com.example.gui_trabajo_final.Controllers;
    opens com.example.gui_trabajo_final.Controllers to javafx.fxml;
}