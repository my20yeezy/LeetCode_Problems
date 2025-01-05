package main;

public class E_1929_ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] ansArray = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ansArray[i] = nums[i];
        }
        for (int i = nums.length; i < ansArray.length; i++) {
            ansArray[i] = nums[i - nums.length];
        }

        return ansArray;
    }
}
