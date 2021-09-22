package lesson3.functional.task4;

import lesson3.utils.MyCollectors;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task4Test {
    @Test
    void countSumOfNumbersSquareTest() {
        assertEquals(0, Stream.of(0, 1, 2, 3)
                .collect(MyCollectors.countProductOfNumbersSquare()));
        assertEquals(144, Stream.of(3, 2, 2, 1)
                .collect(MyCollectors.countProductOfNumbersSquare()));
    }
}