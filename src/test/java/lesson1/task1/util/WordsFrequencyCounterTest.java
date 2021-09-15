package lesson1.task1.util;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static lesson1.task1.util.WordsFrequencyCounter.getWordsFrequency;
import static org.junit.jupiter.api.Assertions.assertEquals;


class WordsFrequencyCounterTest {

    @Test
    void test1() {
        String text = "Lorem Ipsum is simply dummy " +
                "text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy " +
                "text, when an unknown printer " +
                "took a galley of type and scrambled it to make a " +
                "type specimen book. It has survived not only five " +
                "centuries, but also the leap into electronic " +
                "typesetting, remaining essentially unchanged. " +
                "It was popularised with the release " +
                "of Letraset sheets containing Lorem Ipsum " +
                "passages, and more recently with desktop publishing " +
                "software like Aldus PageMaker including versions of Lorem Ipsum.";

        Map<String, Integer> wordsFrequencyMap = getWordsFrequency(text);

        assertEquals(1, wordsFrequencyMap.get("Aldus"));
        assertEquals(4, wordsFrequencyMap.get("Ipsum"));
        assertEquals(2, wordsFrequencyMap.get("It"));
        assertEquals(1, wordsFrequencyMap.get("Letraset"));
        assertEquals(4, wordsFrequencyMap.get("Lorem"));
        assertEquals(1, wordsFrequencyMap.get("PageMaker"));
        assertEquals(2, wordsFrequencyMap.get("a"));
        assertEquals(1, wordsFrequencyMap.get("also"));
        assertEquals(1, wordsFrequencyMap.get("an"));
        assertEquals(3, wordsFrequencyMap.get("and"));
        assertEquals(1, wordsFrequencyMap.get("been"));
        assertEquals(1, wordsFrequencyMap.get("book"));
        assertEquals(1, wordsFrequencyMap.get("but"));
        assertEquals(1, wordsFrequencyMap.get("centuries"));
        assertEquals(1, wordsFrequencyMap.get("containing"));
        assertEquals(1, wordsFrequencyMap.get("desktop"));
        assertEquals(2, wordsFrequencyMap.get("dummy"));
        assertEquals(1, wordsFrequencyMap.get("electronic"));
        assertEquals(1, wordsFrequencyMap.get("essentially"));
        assertEquals(1, wordsFrequencyMap.get("five"));
        assertEquals(1, wordsFrequencyMap.get("galley"));
        assertEquals(2, wordsFrequencyMap.get("has"));
        assertEquals(1, wordsFrequencyMap.get("including"));
        assertEquals(1, wordsFrequencyMap.get("industry"));
        assertEquals(1, wordsFrequencyMap.get("industry's"));
        assertEquals(1, wordsFrequencyMap.get("into"));
        assertEquals(1, wordsFrequencyMap.get("is"));
        assertEquals(1, wordsFrequencyMap.get("it"));
        assertEquals(1, wordsFrequencyMap.get("leap"));
        assertEquals(1, wordsFrequencyMap.get("like"));
        assertEquals(1, wordsFrequencyMap.get("more"));
        assertEquals(1, wordsFrequencyMap.get("not"));
        assertEquals(4, wordsFrequencyMap.get("of"));
        assertEquals(1, wordsFrequencyMap.get("only"));
        assertEquals(1, wordsFrequencyMap.get("passages"));
        assertEquals(1, wordsFrequencyMap.get("popularised"));
        assertEquals(1, wordsFrequencyMap.get("printer"));
        assertEquals(1, wordsFrequencyMap.get("printing"));
        assertEquals(1, wordsFrequencyMap.get("publishing"));
        assertEquals(1, wordsFrequencyMap.get("recently"));
        assertEquals(1, wordsFrequencyMap.get("release"));
        assertEquals(1, wordsFrequencyMap.get("remaining"));
        assertEquals(1, wordsFrequencyMap.get("scrambled"));
        assertEquals(1, wordsFrequencyMap.get("sheets"));
        assertEquals(1, wordsFrequencyMap.get("simply"));
        assertEquals(1, wordsFrequencyMap.get("software"));
        assertEquals(1, wordsFrequencyMap.get("specimen"));
        assertEquals(1, wordsFrequencyMap.get("standard"));
        assertEquals(1, wordsFrequencyMap.get("survived"));
        assertEquals(2, wordsFrequencyMap.get("text"));
        assertEquals(4, wordsFrequencyMap.get("the"));
        assertEquals(1, wordsFrequencyMap.get("to"));
        assertEquals(1, wordsFrequencyMap.get("took"));
        assertEquals(2, wordsFrequencyMap.get("type"));
        assertEquals(2, wordsFrequencyMap.get("typesetting"));
        assertEquals(1, wordsFrequencyMap.get("unchanged"));
        assertEquals(1, wordsFrequencyMap.get("unknown"));
        assertEquals(1, wordsFrequencyMap.get("versions"));
        assertEquals(1, wordsFrequencyMap.get("was"));
        assertEquals(1, wordsFrequencyMap.get("when"));
        assertEquals(2, wordsFrequencyMap.get("with"));
    }
}