package lesson3.part2.task4;

import lesson3.utils.MyCollectors;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {
    @Test
    void countSumOfNumbersSquareTest() {
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3);

        assertEquals(14, numbers.stream()
                .collect(MyCollectors.countSumOfNumbersSquare()));
    }
}