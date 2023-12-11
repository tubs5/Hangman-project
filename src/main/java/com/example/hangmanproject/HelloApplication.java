package com.example.hangmanproject;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        WrongGuesses  wg = new WrongGuesses(40);
        VBox p = new VBox(wg.displayText);

        Scene scene = new Scene(p, 320, 240);
        stage.setTitle("HangmanGame");
        stage.setScene(scene);
        stage.show();

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                System.out.println(wg.addLetter(keyEvent.getText().charAt(0)));
            }
        });


    }

    public static void main(String[] args) {
        launch();
    }
}