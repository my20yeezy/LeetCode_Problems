package test;

import main.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        E_1929_ConcatenationOfArray test = new E_1929_ConcatenationOfArray();

        int[] nums = {1, 3, 5};
        int[] ans = test.getConcatenation(nums);
        for (int i: ans) {
            System.out.println(i);
        }

    }
}
