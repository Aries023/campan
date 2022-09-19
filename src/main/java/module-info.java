module com.example.campan {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.media;


    opens com.example.campan to javafx.fxml;
    exports com.example.campan;
}