package com.example.campan;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label topPanelIngr;
    @FXML
    private Label botPanelWrap;

    // left menu buttons but also secret button on top bar
    @FXML
    protected void baconButtonMenu() {
        botPanelWrap.setText("bacon wrap");
    }
    @FXML
    protected void italianButtonMenu() {
        botPanelWrap.setText("italian wrap");
    }
    @FXML
    protected void asiaButtonMenu() {
        botPanelWrap.setText("asia wrap");
    }
    @FXML
    protected void ajvarButtonMenu() {
        botPanelWrap.setText("ajvar wrap");
    }
    @FXML
    protected void randomButtonMenu() {
        botPanelWrap.setText("Welcome to JavaFX Application!");
    }

}