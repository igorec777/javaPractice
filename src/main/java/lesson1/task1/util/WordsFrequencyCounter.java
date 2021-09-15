package lesson1.task1.util;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;


public class WordsFrequencyCounter {
    public static Map<String, Integer> getWordsFrequency(CharSequence text) {
        String[] words = getWords(text.toString());

        SortedMap<String, Integer> result = new TreeMap<>();

        for (String w : words) {
            result.merge(w, 1, Integer::sum);
        }

        return result;
    }

    private static String[] getWords(String text) {
        return text.replaceAll("[,.0-9]", "")
                .split(" ");
    }
}

