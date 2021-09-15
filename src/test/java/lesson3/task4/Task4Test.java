package lesson3.task4;

import org.junit.jupiter.api.Test;

import static lesson3.task4.Task4.factorial;
import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void factorialTest() {
        assertEquals(1, factorial(0));
        assertEquals(1, factorial(1));
        assertEquals(2, factorial(2));

        assertThrows(IllegalArgumentException.class, () -> factorial(-1));
    }
}