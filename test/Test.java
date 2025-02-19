package test;

import main.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        E_1108_DefangingAnIPAddress test = new E_1108_DefangingAnIPAddress();
        String address = "255.100.50.0";
        String result = test.defangIPaddr(address);
        System.out.println(result);
    }
}
