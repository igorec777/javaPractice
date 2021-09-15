package lesson3.task1;

import org.junit.jupiter.api.Test;

import static lesson3.task1.Task1.isPrime;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void isPrimeTest() {
        assertTrue(isPrime(2));
        assertTrue(isPrime(3));
        assertFalse(isPrime(4));
        assertThrows(IllegalArgumentException.class, () -> isPrime(0));
    }
}