package lesson3.functional.task1;

import org.junit.jupiter.api.Test;

import static lesson3.functional.task1.Task1.allValuesAreDifferentPredicate;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    @Test
    void testTest() {
        assertFalse(allValuesAreDifferentPredicate.test(1, 1, 1));
        assertTrue(allValuesAreDifferentPredicate.test(2, 3, 4));
        assertFalse(allValuesAreDifferentPredicate.test(-3, -3, 2));
    }
}