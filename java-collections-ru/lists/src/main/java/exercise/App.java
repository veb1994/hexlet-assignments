package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String symbols, String word) {
        if (symbols.length() == 0) {
            return false;
        }
        String symbolsToLowerCase = symbols.toLowerCase();
        String wordToLowerCase = word.toLowerCase();
        List<Character> symbolsList = new ArrayList<>();
        for (var i = 0; i < symbolsToLowerCase.length(); i++) {
            symbolsList.add(symbolsToLowerCase.charAt(i));
        }
        for (var i = 0; i < wordToLowerCase.length(); i++) {
            if (symbolsList.contains(wordToLowerCase.charAt(i))) {
                char symbol = wordToLowerCase.charAt(i);
                int symbolIndex = symbolsList.indexOf(symbol);
                symbolsList.set(symbolIndex, null);
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
