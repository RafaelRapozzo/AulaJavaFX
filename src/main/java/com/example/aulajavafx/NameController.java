package com.example.aulajavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class NameController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onNameButtonClick() {
        welcomeText.setText("Rafael Dantas Raposo");
    }
}