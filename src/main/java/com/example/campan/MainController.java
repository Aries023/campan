package com.example.campan;

import com.example.campan.stuffs.Corrector;
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
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"horcica")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("Hrubozrna horčica");
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,"horcica")){ // if its not correct then if wrap contain the ingredient
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
                     }
        }
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