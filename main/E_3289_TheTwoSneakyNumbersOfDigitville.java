package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class E_3289_TheTwoSneakyNumbersOfDigitville {
    public int[] getSneakyNumbers(int[] nums) {

        List<Integer> resultArrayList = new ArrayList<>();
        int[] resultArray = new int[2];
        int[] counterArray = new int[nums.length];
        Set<Integer> setNums = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (setNums.contains(nums[i])) {
                counterArray[i] += 1;
            }
            setNums.add(nums[i]);
        }
        for (int i = 0; i < counterArray.length; i++) {
            if (counterArray[i] > 0) {
                resultArrayList.add(nums[i]);
            }
        }

        resultArray[0] = resultArrayList.get(0);
        resultArray[1] = resultArrayList.get(1);
        return resultArray;
    }
}

//Example 1:
//Input: nums = [0,1,1,0]
//Output: [0,1]
//Explanation:
//The numbers 0 and 1 each appear twice in the array.

//Example 2:
//Input: nums = [0,3,2,1,3,2]
//Output: [2,3]
//Explanation:
//The numbers 2 and 3 each appear twice in the array.