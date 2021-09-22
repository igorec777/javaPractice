package lesson3.functional.task7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static lesson3.functional.task7.Task7.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task7Test {

    @Test
    void multifunctionalMapperTest() {
        assertEquals(Arrays.asList(3, 3 ,3), multTwoAndThenAddOneTransformation.apply(Arrays.asList(1, 1, 1)));
        assertEquals(Arrays.asList(2, 2 ,2), squareAndThenGetNextEvenNumberTransformation.apply(Arrays.asList(1, 1, 1)));

        assertEquals(Arrays.asList(3, 5 ,7), multTwoAndThenAddOneTransformation.apply(Arrays.asList(1, 2, 3)));
        assertEquals(Arrays.asList(2, 6 ,10), squareAndThenGetNextEvenNumberTransformation.apply(Arrays.asList(1, 2, 3)));

        assertEquals(Arrays.asList(3, 2, 9), identityTransformation.apply(Arrays.asList(3, 2, 9)));
        assertEquals(Arrays.asList(92, 45, 31), identityTransformation.apply(Arrays.asList(92, 45, 31)));

        assertEquals(Arrays.asList(122, 226, 10), multifunctionalMapper
                .apply(Arrays.asList(multAndAdd, squareAndNextEven))
                .apply(Arrays.asList(5, 7, 1)));
    }
}