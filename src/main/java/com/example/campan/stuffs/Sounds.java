package com.example.campan.stuffs;

import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;


public class Sounds {
    // create MediaPlayer
    static MediaPlayer player;

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

    public static void successful(){
        // check if its MediaPlayer ready
        if (player != null){
            player.stop();
            player.dispose();
        }

        // URL
        String sound = "C:\\Users\\Peter\\IdeaProjects\\campan\\src\\Swoosh.mp3";

        // Set file from URL to Media
        Media success = new Media(new File(sound).toURI().toString());

        // give Media to MediaPlayer
        player = new MediaPlayer(success);
        // play
        player.play();
    }

    public static void fail(){
        // check if its MediaPlayer ready
        if (player != null){
            player.stop();
            player.dispose();
        }
        // URL
        String sound = "C:\\Users\\Peter\\IdeaProjects\\campan\\src\\Clang and wobble.mp3";

        // Set file from URL to Media
        Media fail = new Media(new File(sound).toURI().toString());

        // give Media to MediaPlayer
        player = new MediaPlayer(fail);
        // play
        player.play();
    }

    public static void closeOne(){
        // check if its MediaPlayer ready
        if (player != null){
            player.stop();
            player.dispose();
        }
        // URL
        String sound = "C:\\Users\\Peter\\IdeaProjects\\campan\\src\\Drumset Falling Down Stairs.mp3";

        // Set file from URL to Media
        Media niceTry = new Media(new File(sound).toURI().toString());

        // give Media to MediaPlayer
        player = new MediaPlayer(niceTry);
        // play
        player.play();
    }

    public static void win(){
        // check if its MediaPlayer ready
        if (player != null){
            player.stop();
            player.dispose();
        }
        String sound = "C:\\Users\\Peter\\IdeaProjects\\campan\\src\\Drumset Falling Down Stairs.mp3";

        // Set file from URL to Media
        Media win = new Media(new File(sound).toURI().toString());

        // give Media to MediaPlayer
        player = new MediaPlayer(win);
        // play
        player.play();
    }

}
