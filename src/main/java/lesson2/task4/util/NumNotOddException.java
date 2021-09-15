package lesson2.task4.util;

import java.util.List;


public class NumNotOddException extends Exception {

    private final int wrongNum;
    private final List<Integer> nums;


    public NumNotOddException(List<Integer> nums, int wrongNum, String msg) {
        super(msg);
        this.nums = nums;
        this.wrongNum = wrongNum;
    }

    public int getWrongNum() {
        return wrongNum;
    }

    public List<Integer> getNums() {
        return nums;
    }
}
