package com.example.hangmanproject;

import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tobias Heidlund
 */
public class WrongGuesses {
    //List<Character> guesses = new ArrayList<Character>();
    Text displayText = new Text();

    public WrongGuesses(int textSize){
        displayText.setFont(new Font("Helvetica",textSize));
    }

    public boolean addLetter(char guess){
        String guessAsString = new StringBuilder().append(guess).toString();
        boolean isLetterAdded = !displayText.getText().contains(guessAsString);
        if(isLetterAdded){
            displayText.setText(displayText.getText() + guessAsString);
        }
        return isLetterAdded;


    }





}
