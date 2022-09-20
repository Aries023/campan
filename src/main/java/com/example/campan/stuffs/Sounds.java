package com.example.campan.stuffs;

import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;


public class Sounds {

    // Starts song in loop at strat of program
    public static void menuSong(){
        // URL
        String runAway = "C:\\Users\\Peter\\IdeaProjects\\campan\\src\\Halcyon - Runaway (feat. Valentina Franco) [NCS Release].mp3";

        // Set file from URL to Media
        Media menuSong = new Media(new File(runAway).toURI().toString());

        // give Media to AudioClip
        AudioClip mediaPLayer = new AudioClip(menuSong.getSource());

        // set AudioClip in loop
        mediaPLayer.setCycleCount(MediaPlayer.INDEFINITE);

        // play AudioClip
        mediaPLayer.play();

    }

}
