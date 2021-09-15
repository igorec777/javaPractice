package lesson3.task3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static lesson3.task3.Task3.createFilteringStream;
import static org.assertj.core.api.Assertions.assertThat;

class Task3Test {

    @Test
    void createFilteringStreamTest1() {
        int[] numbers = {1, 2, 3, 4};
        IntStream evenNums = IntStream.of(numbers).filter(n -> n % 2 == 0);
        IntStream oddNums = IntStream.of(numbers).filter(n -> n % 2 != 0);

        List<Integer> result = createFilteringStream(evenNums, oddNums)
                .boxed()
                .collect(Collectors.toList());

        assertThat(result)
                .hasSizeLessThanOrEqualTo(numbers.length)
                .hasSameElementsAs(Collections.emptyList());
    }

    @Test
    void createFilteringStreamTest2() {
        int[] numbers = {30, 75, 60, 90};
        IntStream evenNums = IntStream.of(numbers).filter(n -> n % 2 == 0);
        IntStream oddNums = IntStream.of(numbers).filter(n -> n % 2 != 0);

        List<Integer> result = createFilteringStream(evenNums, oddNums)
                .boxed()
                .collect(Collectors.toList());

        assertThat(result)
                .hasSizeLessThanOrEqualTo(numbers.length)
                .hasSameElementsAs(Arrays.asList(75, 90));
    }
}