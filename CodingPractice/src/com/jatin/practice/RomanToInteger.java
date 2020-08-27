package com.jatin.practice;

public class RomanToInteger {

    public static void main (String args[]) {
        String romanString = "VII";
        int number = getRomanToNumber(romanString);
        System.out.println(number);
    }

    private static int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    private static int getRomanToNumber(String romanString) {

        int result = 0;
        for (int i = 0; i < romanString.length(); i++) {
            int result1 = value(romanString.charAt(i));
            if (i + 1 < romanString.length()) {
                int result2 = value(romanString.charAt(i+1));
                if (result1 >= result2) {
                    result = result + result1;
                } else {
                    result = result + result2 - result1;
                    i++;
                }
            } else {
                result = result + result1;
                i++;
            }
        }
        return result;
    }

}
