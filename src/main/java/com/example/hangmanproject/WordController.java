package com.example.hangmanproject;

import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.Arrays;

/**
 * @author Tobias Heidlund
 */
public class WordController {
    char[] word;
    Text text;
    int remainingLetters;
    public WordController(String word, int letterSize){
        this.word = word.toCharArray();
        this.remainingLetters = word.length();
        char[] guessingField = new char[remainingLetters];
        Arrays.fill(guessingField,'-');
        text = new Text(new String(guessingField));
        text.setFont(new Font("Helvetica",letterSize));
    }
    public boolean addLetter(char guess){
        boolean hasChanged = false;
        char[] currentText = text.getText().toCharArray();
        for (int i = 0; i < word.length; i++) {
            char c = word[i];
            if(c == guess){
                word[i] = '-';
                currentText[i] = guess;
                hasChanged = true;
                remainingLetters--;
            }
        }
        text.setText(new String(currentText));
        return hasChanged;
    }

}
