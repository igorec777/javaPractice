package lesson3.part2.task6;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void mulNumsTest() {

        Function<Integer, Function<Integer, Function<Integer, Integer>>> mulNums =
                x -> (y -> (z -> x + y * y + z * z * z));
        assertEquals(33, mulNums
                .apply(2)
                .apply(2)
                .apply(3));
    }

    @Test
    void concatStringsTest() {
        Function<String, Function<String, Function<String, Function<String, String>>>> concatStrings = a -> b -> c -> d ->
                a.toLowerCase() +
                        c.toUpperCase() +
                        b.toLowerCase() +
                        d.toUpperCase();

        String result = concatStrings
                .apply("ab")
                .apply("cd")
                .apply("ef")
                .apply("gh");

        assertEquals('a', result.charAt(0));
        assertEquals('b', result.charAt(1));
        assertEquals('E', result.charAt(2));
        assertEquals('F', result.charAt(3));
        assertEquals('c', result.charAt(4));
        assertEquals('d', result.charAt(5));
        assertEquals('G', result.charAt(6));
        assertEquals('H', result.charAt(7));
    }
}