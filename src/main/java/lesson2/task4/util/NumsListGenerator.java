package lesson2.task4.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class NumsListGenerator {

    private static final int NUMS_COUNT = 3;
    private static final int LEFT_BOUND = 1;
    private static final int RIGHT_BOUND = 9;

    private static List<Integer> nums;

    private NumsListGenerator() {
    }

    public static void generateNumsList() {

        nums = new ArrayList<>();

        for (int i = 0; i < NUMS_COUNT; i++) {
            nums.add(generateNum());
        }
    }

    private static int generateNum() {
        return new Random().nextInt(RIGHT_BOUND - LEFT_BOUND) + LEFT_BOUND;
    }

    public static List<Integer> getNumsList() {
        return nums;
    }

    public static int getNumsCount() {
        return NUMS_COUNT;
    }

    public static int getLeftBound() {
        return LEFT_BOUND;
    }

    public static int getRightBound() {
        return RIGHT_BOUND;
    }
}
