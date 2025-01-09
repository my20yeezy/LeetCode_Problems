package main;

public class M_1769_MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public int[] minOperations(String boxes) {
        int[] result = new int[boxes.length()];
        char[] boxesChar = boxes.toCharArray();
        for (int i = 0; i < boxesChar.length; i++) {
            for (int j = 0; j < boxesChar.length; j++) {
                if (boxesChar[j] == '1') {
                    int distance = Math.abs(j - i);
                    result[i] += distance;
                }
            }
        }
        return result;
    }
}

//Example 1:
//Input: boxes = "110"
//Output: [1,1,3]
//Explanation: The answer for each box is as follows:
//        1) First box: you will have to move one ball from the second box to the first box in one operation.
//        2) Second box: you will have to move one ball from the first box to the second box in one operation.
//        3) Third box: you will have to move one ball from the first box to the third box in two operations,
//        and move one ball from the second box to the third box in one operation.

//Example 2:
//Input: boxes = "001011"
//Output: [11,8,5,4,3,4]