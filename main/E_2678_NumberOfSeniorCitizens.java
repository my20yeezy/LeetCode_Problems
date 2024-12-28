package main;

public class E_2678_NumberOfSeniorCitizens {
    public int countSeniors(String[] details) {
        int result = 0;
        for (int i = 0; i < details.length; i++) {
            char[] charsOfString = details[i].toCharArray();
            int firstDigit = Integer.parseInt(String.valueOf(charsOfString[11]));
            int secondDigit = Integer.parseInt(String.valueOf(charsOfString[12]));
            int age = firstDigit * 10 + secondDigit;
            if (age > 60) {
                result++;
            }
        }
        return result;
    }
}


//Example 1:
//Input: details = ["7868190130M7522","5303914400F9211","9273338290F4010"]
//Output: 2
//Explanation: The passengers at indices 0, 1, and 2 have ages 75, 92, and 40. Thus, there are 2 people who are over 60 years old.
//
//Example 2:
//Input: details = ["1313579440F2036","2921522980M5644"]
//Output: 0
//Explanation: None of the passengers are older than 60.