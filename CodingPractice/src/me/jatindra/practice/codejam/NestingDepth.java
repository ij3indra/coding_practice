package me.jatindra.practice.codejam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NestingDepth {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int testCase = scanner.nextInt();
        int caseNumber = 1;

        while (caseNumber <= testCase) {
            String digitString = scanner.next();
            String inDepth = getInDepth(digitString);
            System.out.println("Case #"+caseNumber + ": " + inDepth);
            caseNumber++;
        }
    }

    // 101
    private static String getInDepth(String inputString) {
        inputString = "0" + inputString + "0";
        // 01010
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputString.length() - 1; i++) {
            sb.append(inputString.charAt(i));
            if (getIntValue(inputString.charAt(i+1)) > getIntValue(inputString.charAt(i))) {
                addParenthesis("(", sb, getIntValue(inputString.charAt(i+1)) - getIntValue(inputString.charAt(i)));
            } else if (getIntValue(inputString.charAt(i)) > getIntValue(inputString.charAt(i+1))) {
                addParenthesis(")", sb, getIntValue(inputString.charAt(i)) - getIntValue(inputString.charAt(i+1)));
            } else {

            }
        }
        return sb.toString().substring(1);
    }

    private static int getIntValue(Character c) {
        return Integer.parseInt(c.toString());
    }

    private static void addParenthesis(String parenthesis, StringBuilder sb, int count){
        for (int i =0 ; i < count; i ++) {
            sb.append(parenthesis);
        }
    }
}
