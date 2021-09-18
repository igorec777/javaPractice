package lesson3.part1.task2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static lesson3.part1.task2.Task2.createBadWordsDetectingStream;
import static org.assertj.core.api.Assertions.assertThat;

class Task2Test {

    @Test
    void createBadWordsDetectingStreamTest() {
        String text = "Proin elementum sem sit amet purus sem tempor sodales";
        List<String> badWords = Arrays.asList("tempor", "sem", "elementum", "Lorem", "ipsum");

        assertThat(createBadWordsDetectingStream(text, badWords).collect(Collectors.toList()))
                .hasSizeLessThanOrEqualTo(badWords.size())
                .hasSameElementsAs(Arrays.asList("tempor", "sem", "elementum"));
    }
}