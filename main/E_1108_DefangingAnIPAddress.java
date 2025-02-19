package main;

import java.util.ArrayList;
import java.util.List;

public class E_1108_DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        String result;
        List<Integer> listOfDots = new ArrayList<>();
        String first;
        String second;
        String third;
        String fourth;
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                listOfDots.add(i);
            }
        }
        first = address.substring(0, listOfDots.get(0));
        second = address.substring(listOfDots.get(0) + 1, listOfDots.get(1));
        third = address.substring(listOfDots.get(1) + 1, listOfDots.get(2));
        fourth = address.substring(listOfDots.get(2) + 1);
        result = first + "[.]" + second + "[.]" + third + "[.]" + fourth;
        return result;
    }
}

//Given a valid (IPv4) IP address, return a defanged version of that IP address.
//A defanged IP address replaces every period "." with "[.]".
//
//
//Example 1:
//Input: address = "1.1.1.1"
//Output: "1[.]1[.]1[.]1"

//Example 2:
//Input: address = "255.100.50.0"
//Output: "255[.]100[.]50[.]0"