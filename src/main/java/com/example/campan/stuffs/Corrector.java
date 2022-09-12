package com.example.campan.stuffs;

import java.util.List;
import java.util.Objects;

    //  check if wrap is null
    public class Corrector {
        public  static boolean nullChecker(List<String> wrap){
            return wrap.isEmpty();
        }

    //  check if its right ingredient
    public static boolean controlIngredient(List<String> wrap, byte where,String ingredient){
        return Objects.equals(wrap.get(where), ingredient);
    }

    //  check if wrap contain ingredient
    public static boolean isContains (List<String> wrap,String ingredient){
        return wrap.contains(ingredient);
    }

    // check if it's a last ingredient
        public static boolean finishControl(List<String> wrap,byte where){
            return wrap.size()-1 == where;
        }
}
