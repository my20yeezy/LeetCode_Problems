package test;

import main.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        E_3190_FindMinimumOperationsToMakeAllElementsDivisibleByThree test = new E_3190_FindMinimumOperationsToMakeAllElementsDivisibleByThree();
        int result = test.minimumOperations(new int[]{3,6,9});
        System.out.println(result);
    }
}
