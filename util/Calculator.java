package ru.khlebnikova.calcapp.util;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Calculator {

    private static int result;

    public static int sum(int firstNum, int secondNum) {
        return result = firstNum + secondNum;
    }

    public static int difference(int firstNum, int secondNum) {
        return result = firstNum - secondNum;
    }

    public static int multiplication(int firstNum, int secondNum) {
        return result = firstNum * secondNum;
    }
}
