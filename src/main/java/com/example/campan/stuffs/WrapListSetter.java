package com.example.campan.stuffs;

import java.util.List;

public class WrapListSetter { // set wrap pole to bacon wrap
    public static void setToBaconWrap(List<String> pole){
        // clear pole
        pole.clear();

        // add ingrediends
        pole.add("horcicaH");
        pole.add("kecup");
        pole.add("uhorky");
        pole.add("salat");
        pole.add("paradajky");
        pole.add("strCheddar");
        pole.add("bacon");
    }
    public static void setToItalianWrap(List<String> pole){
        // clear pole
        pole.clear();

        // add ingrediends
        pole.add("garlic");
        pole.add("tomato");
        pole.add("cibulaB");
        pole.add("rukola");
        pole.add("paradajky");
        pole.add("uhorkyS");
    }
    public static void setToAsiaWrap(List<String> pole){
        // clear pole
        pole.clear();

        // add ingrediends
        pole.add("garlic");
        pole.add("sriracha");
        pole.add("cibulaR");
        pole.add("salat");
        pole.add("uhorkyS");
    }
    public static void setToAjvarWrap(List<String> pole){
        // clear pole
        pole.clear();

        // add ingrediends
        pole.add("sandwitch");
        pole.add("ajvar");
        pole.add("kapia");
        pole.add("salat");
        pole.add("rukola");
        pole.add("paradajky");
    }
}
