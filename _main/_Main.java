package ru.khlebnikova.calcapp._main;

import ru.khlebnikova.calcapp.service.ResultWriterService;
import ru.khlebnikova.calcapp.util.Calculator;

public class _Main {

    public static void main(String[] args) {

        ResultWriterService.typeResult(15, 2, Calculator.sum(15, 2), "sum");
        ResultWriterService.typeResult(15, 25, Calculator.difference(15, 25), "difference");
        ResultWriterService.typeResult(15, 2, Calculator.multiplication(15, 2), "multiplication");

    }
}
