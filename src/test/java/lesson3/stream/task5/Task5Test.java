package lesson3.stream.task5;

import org.junit.jupiter.api.Test;

import static lesson3.stream.task5.Task5.sumOfOddNumbersInRange;
import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void sumOfOddNumbersInRangeTest() {
        assertEquals(0L, sumOfOddNumbersInRange(0L, 0L));
        assertEquals(16L, sumOfOddNumbersInRange(7L, 9L));
        assertEquals(125L, sumOfOddNumbersInRange(21L, 30L));
    }
}