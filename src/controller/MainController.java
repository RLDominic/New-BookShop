package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    @FXML
    private Button btnViewBooks;

    @FXML
    public void initialize() {
        System.out.println("Vista cargada correctamente");
    }
}
