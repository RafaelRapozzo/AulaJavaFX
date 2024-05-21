module com.example.aulajavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.aulajavafx to javafx.fxml;
    exports com.example.aulajavafx;
}