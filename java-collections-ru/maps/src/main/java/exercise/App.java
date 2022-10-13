package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map getWordCount(String sentence) {
        Map<String, Integer> wordsCount = new HashMap<>();
        if(sentence.equals("")) {
            return wordsCount;
        }
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (wordsCount.containsKey(word)) {
                int count = wordsCount.get(word);
                wordsCount.put(word, count + 1);
            } else {
                wordsCount.put(word, 1);
            }
        }
        return wordsCount;
    }

    public static String toString(Map<String, Integer> wordsCount) {
        if (wordsCount.size() == 0) {
            return "{}";
        }
        String result = "{\n";
        for (Map.Entry<String, Integer> word: wordsCount.entrySet()) {
            result = result + "  " + word.getKey() + ": " + word.getValue() + "\n";
        }
        result = result + "}";
        return result;
    }
}
//END
