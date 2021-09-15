package lesson2.task4.util;

import lesson2.task4.app.Program;
import org.junit.jupiter.api.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static lesson2.task4.util.NumsListGenerator.*;
import static lesson2.task4.util.NumsListValidator.isAllNumsOdd;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class NumsListGeneratorTest {

    @Test
    void generateNumsListTest() {
        generateNumsList();

        //Check if list has correct size
        assertEquals(getNumsCount(), getNumsList().size());

        //Check if all numbers are in correct range
        for (int n : getNumsList()) {
            assertTrue(n >= getLeftBound() && n <= getRightBound());
        }
    }

    @Test
    void isAllNumsOddTest() {
        while (true) {
            generateNumsList();

            try {
                isAllNumsOdd(getNumsList());
            } catch (NumNotOddException e) {
                Logger logger = Logger.getLogger(Program.class.getName());
                logger.log(Level.WARNING, "List " + e.getNums() + " has even number: " + e.getWrongNum());
                continue;
            }
            break;
        }
        //Check if all numbers are odd
        for (int n : getNumsList()) {
            assertTrue(n % 2 != 0);
        }
    }
}