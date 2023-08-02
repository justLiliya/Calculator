package ru.khlebnikova.calcApp.util;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Calculator {

    public static int sum(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        return result;
    }

    public static int difference(int firstNum, int secondNum) {
        int result = max(firstNum, secondNum) - min(firstNum, secondNum);
        return result;
    }

    public static int multiplication(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        return result;
    }
}
