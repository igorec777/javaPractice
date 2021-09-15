package lesson2.task4.app;

import lesson2.task4.util.NumNotOddException;

import java.util.logging.Level;
import java.util.logging.Logger;

import static lesson2.task4.util.NumsListGenerator.generateNumsList;
import static lesson2.task4.util.NumsListGenerator.getNumsList;
import static lesson2.task4.util.NumsListValidator.isAllNumsOdd;


public class Program {

    static Logger logger;

    public static void main(String... args) {

        while (true) {
            generateNumsList();

            try {
                isAllNumsOdd(getNumsList());
            } catch (NumNotOddException e) {
                logger = Logger.getLogger(Program.class.getName());
                logger.log(Level.WARNING, "List " + e.getNums() + " has even number: " + e.getWrongNum());
                continue;
            }
            break;
        }
        System.out.println("List of odd numbers: " + getNumsList());
    }
}
