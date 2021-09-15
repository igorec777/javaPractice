package lesson3.task3;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static lesson3.task3.Task3.createFilteringStream;
import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void createFilteringStreamTest1() {
        IntStream evenNums = IntStream.of(1, 2, 3, 4).filter(n -> n % 2 == 0);
        IntStream oddNums = IntStream.of(1, 2, 3, 4).filter(n -> n % 2 != 0);

        List<Integer> result = createFilteringStream(evenNums, oddNums)
                .boxed()
                .collect(Collectors.toList());

        assertEquals("[]", result.toString());
    }

    @Test
    void createFilteringStreamTest2() {
        IntStream evenNums = IntStream.of(30, 75, 60, 90).filter(n -> n % 2 == 0);
        IntStream oddNums = IntStream.of(30, 75, 60, 90).filter(n -> n % 2 != 0);

        List<Integer> result = createFilteringStream(evenNums, oddNums)
                .boxed()
                .collect(Collectors.toList());

        assertEquals("[75, 90]", result.toString());
    }
}