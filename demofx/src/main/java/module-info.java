module com.example.demofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demofx to javafx.fxml;
    exports com.example.demofx;
}