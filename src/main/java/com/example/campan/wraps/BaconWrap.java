package com.example.campan.wraps;

import java.util.Set;

public class BaconWrap { // set wrap pole to bacon wrap
    public Set<String> setPole(Set<String> pole){
        // clear pole
        pole.clear();

        // add ingrediends
        pole.add("horcica");
        pole.add("kecup");
        pole.add("kUhorky");
        pole.add("salat");
        pole.add("paradajky");
        pole.add("chedar");
        pole.add("bacon");
        return pole;
    }
}
