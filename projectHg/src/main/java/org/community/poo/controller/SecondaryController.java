package org.community.poo.controller;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.community.poo.model.App;

public class SecondaryController {

    public Button secondaryButton;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("/./primary");
    }
}