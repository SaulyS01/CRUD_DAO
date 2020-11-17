package org.community.poo.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import org.community.poo.model.App;

public class PrimaryController implements Initializable {

    public Button primaryButton;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("/./secondary");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
