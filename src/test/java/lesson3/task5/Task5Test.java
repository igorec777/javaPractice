package lesson3.task5;

import org.junit.jupiter.api.Test;

import static lesson3.task5.Task5.sumOfOddNumbersInRange;
import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void sumOfOddNumbersInRangeTest() {
        assertEquals(0, sumOfOddNumbersInRange(0, 0));
        assertEquals(16, sumOfOddNumbersInRange(7, 9));
        assertEquals(125, sumOfOddNumbersInRange(21, 30));
    }
}