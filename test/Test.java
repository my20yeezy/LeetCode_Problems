package test;

import main.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        E_771_JewelsAndStones test = new E_771_JewelsAndStones();

        String jewels = "aA";
        String stones = "aAAbbbb";



        System.out.println(test.numJewelsInStones(jewels, stones));
    }
}