package com.example.campan;

import com.example.campan.stuffs.Sounds;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Campan extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Campan.class.getResource("mainCampan.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1150, 800);
        stage.setTitle("Campan wrap party!");
        stage.setScene(scene);
        stage.show();
        Sounds.menuSong(); // play song when program starts
    }

    public static void main(String[] args) {
        launch();
    }
}