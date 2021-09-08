module com.example.medwaste {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.medwaste to javafx.fxml;
    exports com.example.medwaste;
}