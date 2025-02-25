/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author PC
 */


import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordCounter {
    private final Map<Character, Integer> charCounter;
    private final Map<String, Integer> wordCounter;

    public WordCounter(String content) {
        charCounter = new HashMap<>();
        wordCounter = new HashMap<>();
        analyze(content);
    }

    public void displayCounter() {
        System.out.println("Word Count: " + wordCounter);
        System.out.println("Character Count: " + charCounter);
    }

    private void analyze(String content) {
        for (char ch : content.toCharArray()) {
            if (!Character.isWhitespace(ch)) {
                charCounter.put(ch, charCounter.getOrDefault(ch, 0) + 1);
            }
        }
        
        StringTokenizer tokenizer = new StringTokenizer(content);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            wordCounter.put(token, wordCounter.getOrDefault(token, 0) + 1);
        }
    }
}
