package ru.khlebnikova.calcApp.util;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Calculator {
    //Внутри Calculator Должны быть реализованы 3 метода: сумма, разность,
    // произведение. (с английскими названиями. названия у методов должны быть
    // словами-глаголами) Каждый из этих методов должен принимать 2 числа в качестве параметров и возвращать результат.

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
