package test;

import main.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        E_3289_TheTwoSneakyNumbersOfDigitville test = new E_3289_TheTwoSneakyNumbersOfDigitville();
        int[] nums = {0,3,2,1,3,2};
        int[] result = test.getSneakyNumbers(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }
    }
}
