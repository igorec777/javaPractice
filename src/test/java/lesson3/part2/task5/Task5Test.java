package lesson3.part2.task5;

import lesson3.utils.MyCollectors;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {
    @Test
    void partitioningByPalindromesTest() {
        assertEquals(List.of("aaaa", "aaa", "a", "aa"), Arrays
                .stream(new String[]{"aaaa", "aaa", "a", "aa"})
                .collect(MyCollectors.partitioningByPalindromes()).get(true));

        assertEquals(List.of("level"), Arrays
                .stream(new String[]{"bbaa", "ac", "level"})
                .collect(MyCollectors.partitioningByPalindromes()).get(true));

        assertEquals(List.of("asd"), Arrays
                .stream(new String[]{"asd", "qwq"})
                .collect(MyCollectors.partitioningByPalindromes()).get(false));
    }
}