package me.jatindra.practice.common;

/*
    Factorial of 0 = 1
    1! = 1 * 0! = 1
    2! = 2 * 1! = 2 (2*1)
    3! = 3 * 2! = 6 (3*2*1)
    4! = 4 * 3! = 24 (4*3*2*1)
    n1 = n * (n-1)!

 */
public class Factorial {

    public static void main(String args[]) {

        int inputNumber = 4;

        int factorial = getFactorialByIterative(inputNumber);
        System.out.println("Factorial by iterative " + factorial);

        factorial = getFactorialByRecursion(inputNumber);
        System.out.println("Factorial by Recursion " + factorial);
    }

    private static int getFactorialByIterative(int inputNumber) {

        if (inputNumber == 0 || inputNumber == 1) {
            return 1;
        }

        int result = 1;
        for (int i = inputNumber; i > 0; i-- ) {
            result = result * i;
        }

        return result;
    }

    private static int getFactorialByRecursion(int inputNumber) {

        if (inputNumber == 0) {
            return 1;
        }

        return inputNumber * getFactorialByRecursion(inputNumber - 1);
    }

}
