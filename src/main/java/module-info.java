module com.example.scencechanger {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scencechanger to javafx.fxml;
    exports com.example.scencechanger;
}