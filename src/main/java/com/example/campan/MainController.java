package com.example.campan;

import com.example.campan.stuffs.WrapListSetter;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.List;

public class MainController {
    @FXML
    private Label topPanelIngr,botPanelWrap;

    List<String> actualWrap = new ArrayList<>(); // List of  needed ingredient
    byte position = 0;  // what ingredient is needed right now

    // left menu --> buttons
    @FXML
    protected void baconButtonMenu() {
        botPanelWrap.setText("bacon wrap");
        WrapListSetter.setToBaconWrap(actualWrap);
        System.out.println(actualWrap);
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

    // center --> garnir buttons
    // 0
    @FXML
    protected void garnir0Ajvar() {
        topPanelIngr.setText("Ajvar sos");
    }
    @FXML
    protected void garnir0Asia() {
        topPanelIngr.setText("Asia sos");
    }
    @FXML
    protected void garnir0Horcica() {
        topPanelIngr.setText("Hrubozrna horčica");
    }
    @FXML
    protected void garnir0Tasty() {
        topPanelIngr.setText("Tasty sos");
    }
    @FXML
    protected void garnir0Italian() {
        topPanelIngr.setText("Tomato Italian sos");
    }
    @FXML
    protected void garnir0Garlic() {
        topPanelIngr.setText("Garlic sos");
    }
    @FXML
    protected void garnir0Sandwitch() {
        topPanelIngr.setText("Sandwitch sos");
    }
    @FXML
    protected void garnir0BigMac() {
        topPanelIngr.setText("Big Mac sos");
    }

    // 1
    @FXML
    protected void garnir1Emental() {
        topPanelIngr.setText("Emental");
    }
    @FXML
    protected void garnir1UhorkaSal() {
        topPanelIngr.setText("Uhorky šalatove");
    }
    @FXML
    protected void garnir1StruhChedar() {
        topPanelIngr.setText("Struhany Chedar");
    }
    @FXML
    protected void garnir1RestCibula() {
        topPanelIngr.setText("Restovana cibula");
    }
    @FXML
    protected void garnir1BielaCibula() {
        topPanelIngr.setText("Biela cibula");
    }
    @FXML
    protected void garnir1Jalapenos() {
        topPanelIngr.setText("Jalapenos");
    }

}