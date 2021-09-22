package lesson3.stream.task4;

import org.junit.jupiter.api.Test;

import static lesson3.stream.task4.Task4.factorial;
import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void factorialTest() {
        assertEquals(1L, factorial(0L));
        assertEquals(1L, factorial(1L));
        assertEquals(2L, factorial(2L));

        assertThrows(IllegalArgumentException.class, () -> factorial(-1L));
    }
}