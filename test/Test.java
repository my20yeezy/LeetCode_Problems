package test;

import main.*;

public class Test {
    public static void main(String[] args) {
        E_1_TwoSum test = new E_1_TwoSum();
        int[] array = {3, 2, 4};
        int target = 6;
        System.out.println(test.twoSum(array, target)[0] + " " + test.twoSum(array, target)[1]);

    }

}
