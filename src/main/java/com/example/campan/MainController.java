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
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"ajvar")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("Ajvar sos");
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,"ajvar")){ // if its not correct then if wrap contain the ingredient
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
            }
        }
    }
    @FXML
    protected void garnir0Asia() {
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"sriracha")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("Asia sos");
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,"sriracha")){ // if its not correct then if wrap contain the ingredient
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
            }
        }
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
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"tasty")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("Tasty sos");
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,"tasty")){ // if its not correct then if wrap contain the ingredient
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
            }
        }
    }
    @FXML
    protected void garnir0Italian() {
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"tomato")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("Tomato Italian sos");
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,"tomato")){ // if its not correct then if wrap contain the ingredient
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
            }
        }
    }
    @FXML
    protected void garnir0Garlic() {
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"garlic")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("Garlic sos");
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,"garlic")){ // if its not correct then if wrap contain the ingredient
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
            }
        }
    }
    @FXML
    protected void garnir0Sandwitch() {
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"sandwitch")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("Sandwitch sos");
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,"sandwitch")){ // if its not correct then if wrap contain the ingredient
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
            }
        }
    }
    @FXML
    protected void garnir0BigMac() {
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"bigmac")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("BigMac sos");
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,"bigmac")){ // if its not correct then if wrap contain the ingredient
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
            }
        }
    }

    // 1
    @FXML
    protected void garnir1Emental() {
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"emental")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("Emental");
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,"emental")){ // if its not correct then if wrap contain the ingredient
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
            }
        }
    }
    @FXML
    protected void garnir1UhorkaSal() {
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"uhorkyS")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("Uhorky šalatove");
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,"uhorkyS")){ // if its not correct then if wrap contain the ingredient
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
            }
        }
    }
    @FXML
    protected void garnir1StruhCheddar() {
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"strCheddar")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("Struhany Cheddar");
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,"strCheddar")){ // if its not correct then if wrap contain the ingredient
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
            }
        }
    }
    @FXML
    protected void garnir1RestCibula() {
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"cibulaR")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("Restovana cibula");
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,"cibulaR")){ // if its not correct then if wrap contain the ingredient
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
            }
        }
    }
    @FXML
    protected void garnir1BielaCibula() {
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"cibulaB")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("Biela cibula");
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,"cibulaB")){ // if its not correct then if wrap contain the ingredient
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
            }
        }
    }
    @FXML
    protected void garnir1Jalapenos() {
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"jalapenos")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("Jalapenos");
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,"jalapenos")){ // if its not correct then if wrap contain the ingredient
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
            }
        }
    }

    // garnir 2
    public void garnir2Cheddar() {
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"cheddar")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("Cheddar");
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,"cheddar")){ // if its not correct then if wrap contain the ingredient
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
            }
        }
    }

    public void garnir2Bacon() {
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"bacon")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("Bacon");
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,"bacon")){ // if its not correct then if wrap contain the ingredient
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
            }
        }
    }

    public void garnir2Paradajky() {
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"paradajky")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("Paradajky");
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,"paradajky")){ // if its not correct then if wrap contain the ingredient
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
            }
        }
    }

    public void garnir2Rukola() {
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"rukola")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("Rukola");
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,"rukola")){ // if its not correct then if wrap contain the ingredient
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
            }
        }
    }

    public void garnir2Salat() {
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"salat")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("Salat");
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,"salat")){ // if its not correct then if wrap contain the ingredient
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
            }
        }
    }

    public void garnir2Uhorky() {
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"uhorky")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("Kysle Uhorky");
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,"uhorky")){ // if its not correct then if wrap contain the ingredient
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
            }
        }
    }

    // garnir 3
    public void garnir3ChickenBurgSos() {
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"chickBurgSos")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("ChickenBurger Sos");
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,"chickBurgSos")){ // if its not correct then if wrap contain the ingredient
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
            }
        }
    }

    public void garnir3Kecup() {
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"kecup")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("Kečup");
                    position++;
                }
            }else {
                if (Corrector.isContains(actualWrap,"kecup")){ // if its not correct then if wrap contain the ingredient
                    topPanelIngr.setText("niečo si preskočil alebo tam toho dal trocha vela.. ale vratim  čas a dam ti este šancu..");
                }else {
                    topPanelIngr.setText("Ups.. pokazil si wrap, musiš ist znova!");
                    position=0;
                }
            }
        }
    }

    public void garnir3Horcica() {
        if (Corrector.nullChecker(actualWrap)){ // check if its null
            topPanelIngr.setText("Ups.. a aky že wrap to robime?");
        }else {
            if (Corrector.controlIngredient(actualWrap,position,"horcica")){ // check if its correct ingredient
                if (Corrector.finishControl(actualWrap,position)){
                    topPanelIngr.setText("Congratulations, you did it!");
                    position=0;
                }else {
                    topPanelIngr.setText("Horčica");
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
}