package test;

import main.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        M_1769_MinimumNumberOfOperationsToMoveAllBallsToEachBox test = new M_1769_MinimumNumberOfOperationsToMoveAllBallsToEachBox();

        String boxes = "001011";

        int[] result = test.minOperations(boxes);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
