package main;

public class M_1014_BestSightseeingPair {
    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = 0;
        int currentScore = values[0];
        for (int j = 1; j < values.length; j++) {
            maxScore = Math.max(maxScore, currentScore + values[j] - j);
            currentScore = Math.max(currentScore, values[j] + j);

        }
        return maxScore;
    }
}

//You are given an integer array values where values[i] represents the value of the ith sightseeing spot. Two sightseeing spots i and j have a distance j - i between them.
//The score of a pair (i < j) of sightseeing spots is values[i] + values[j] + i - j: the sum of the values of the sightseeing spots, minus the distance between them.
//Return the maximum score of a pair of sightseeing spots.
//
//Example 1:
//Input: values = [8,1,5,2,6]
//Output: 11
//Explanation: i = 0, j = 2, values[i] + values[j] + i - j = 8 + 5 + 0 - 2 = 11
//
//Example 2:
//Input: values = [1,2]
//Output: 2
//
//Constraints:
//        2 <= values.length <= 5 * 104
//        1 <= values[i] <= 1000

//The formula for the score is: score = values[i] + values[j] + i - j.
//This can be rewritten as: score = (values[i] + i) + (values[j] - j).
//Here:
//values[i] + i represents the "potential" of the first sightseeing spot i.
//values[j] - j represents the "reduced" value of the second sightseeing spot j due to the distance penalty.

//1. Keep track of the maximum value of values[i] + i (denoted as currentScore) as you iterate through the array.
//        2. For each index j:
//Calculate the score using the formula: currentScore + values[j] - j.
//Update the maximum score (ans) based on the current score.
//        3. Update currentScore to be the maximum of its current value and values[j] + j, which accounts for the new index j.
//        4. Repeat this for all indices and return the maximum score.