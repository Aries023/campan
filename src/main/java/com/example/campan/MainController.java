package com.example.campan;

import com.example.campan.stuffs.Corrector;
import com.example.campan.stuffs.Sounds;
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
        WrapListSetter.setToItalianWrap(actualWrap);
    }
    @FXML
    protected void asiaButtonMenu() {
        botPanelWrap.setText("asia wrap");
        WrapListSetter.setToAsiaWrap(actualWrap);
    }
    @FXML
    protected void ajvarButtonMenu() {
        botPanelWrap.setText("ajvar wrap");
        WrapListSetter.setToAjvarWrap(actualWrap);
    }
    @FXML
    protected void randomButtonMenu() {
        botPanelWrap.setText("Welcome to JavaFX Application!");
    }

    // center --> garnir buttons
    // 0
    @FXML
    protected void garnir0Ajvar() {
        buttonManager("Ajvar sos","ajvar");
    }
    @FXML
    protected void garnir0Asia() {
        buttonManager("Asia sos / Sriracha","sriracha");
    }
    @FXML
    protected void garnir0Horcica() {
        buttonManager("Hrubozrna horčica","horcicaH");
    }
    @FXML
    protected void garnir0Tasty() {
        buttonManager("Tasty sos","tasty");
    }
    @FXML
    protected void garnir0Italian() {
        buttonManager("Tomato Italian sos","tomato");
    }
    @FXML
    protected void garnir0Garlic() {
        buttonManager("Garlic sos","garlic");
    }
    @FXML
    protected void garnir0Sandwitch() {
        buttonManager("Sandwitch sos","sandwitch");
    }
    @FXML
    protected void garnir0BigMac() {
        buttonManager("BigMac sos","bigmac");
    }

    // garnir 1  ---------------------------------------------
    @FXML
    protected void garnir1Emental() {
        buttonManager("Emental","emental");
    }
    @FXML
    protected void garnir1UhorkaSal() {
        buttonManager("Uhorky šalatove","uhorkyS");
    }
    @FXML
    protected void garnir1StruhCheddar() {
        buttonManager("Struhany Cheddar","strCheddar");
    }
    @FXML
    protected void garnir1RestCibula() {
        buttonManager("Restovana cibula","cibulaR");
    }
    @FXML
    protected void garnir1BielaCibula() {
        buttonManager("Biela cibula","cibulaB");
    }
    @FXML
    protected void garnir1Jalapenos() {
        buttonManager("Jalapenos","jalapenos");
    }


    // garnir 2 ------------------------------------------------
    public void garnir2Cheddar() {
        buttonManager("Cheddar","cheddar");
    }

    public void garnir2Bacon() {
        buttonManager("Bacon","bacon");
    }

    public void garnir2Paradajky() {
        buttonManager("Paradajky","paradajky");
    }

    public void garnir2Rukola() {
        buttonManager("Rukola","rukola");
    }

    public void garnir2Salat() {
        buttonManager("Salat","salat");
    }

    public void garnir2Uhorky() {
        buttonManager("Kysle Uhorky","uhorky");
    }


    // garnir 3 -----------------------------------------------------------------
    public void garnir3ChickenBurgSos() {
        buttonManager("ChickenBurger Sos","chickBurgSos");
    }

    public void garnir3Kecup() {

        buttonManager("Kečup","kecup");
    }

    public void garnir3Horcica() {
        buttonManager("Horčica","horcica");
    }

    // functionality of buttons
    void buttonManager(String nameIngredient, String nameKey){
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            Sounds.fail();
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,nameKey)){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    Sounds.win();
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    Sounds.successful();
                    topPanelIngr.setText(nameIngredient);
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,nameKey)){ // if its not correct then if wrap contain the ingredient
                    Sounds.closeOne();
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    Sounds.fail();
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
            }
        }
    }
}