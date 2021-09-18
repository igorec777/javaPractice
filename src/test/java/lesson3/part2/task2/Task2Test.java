package lesson3.part2.task2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

import static lesson3.part2.task2.Task2.disjunctAll;
import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void disjunctAllTest() {
        List<IntPredicate> predicateList = new ArrayList<>();

        predicateList.add(val -> val < 5);
        predicateList.add(val -> val == 45);
        predicateList.add(val -> val == 123);

        assertTrue(disjunctAll(predicateList).test(123));
        assertTrue(disjunctAll(predicateList).test(4));
        assertFalse(disjunctAll(predicateList).test(46));

        assertFalse(disjunctAll(new ArrayList<>()).test(1));
        assertFalse(disjunctAll(new ArrayList<>()).test(-1));
        assertFalse(disjunctAll(new ArrayList<>()).test(0));

    }
}