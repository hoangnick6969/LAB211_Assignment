/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author PC
 */
public class WordCounter {
    private String input;

    public WordCounter(String input) {
        this.input = input;
    }

    public int countWords() {
        return input.split("\\s+").length;
    }

    public int countCharacters() {
        return input.replace(" ", "").length();
    }

    public void displayCounter() {
        System.out.println("Number of words: " + countWords());
        System.out.println("Number of characters: " + countCharacters());
    }
}

