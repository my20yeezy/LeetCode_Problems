package main;

public class E_2011_FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("--X") || operations[i].equals("X--")) {
                x -= 1;
            }
            if (operations[i].equals("++X") || operations[i].equals("X++")) {
                x += 1;
            }
        }
        return x;
    }
}

//Example 1:
//Input: operations = ["--X","X++","X++"]
//Output: 1
//Explanation: The operations are performed as follows:
//Initially, X = 0.
//        --X: X is decremented by 1, X =  0 - 1 = -1.
//X++: X is incremented by 1, X = -1 + 1 =  0.
//X++: X is incremented by 1, X =  0 + 1 =  1.
