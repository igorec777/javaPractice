package lesson2.task4.util;

import java.util.List;


public class NumsListValidator {

    private NumsListValidator() {
    }

    public static boolean isAllNumsOdd(List<Integer> nums) throws NumNotOddException {
        for (int n : nums)
            if (n % 2 == 0) {
                throw new NumNotOddException(nums, n, "NumNotOddException");
            }
        return true;
    }
}
