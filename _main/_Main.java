package ru.khlebnikova.calcApp._main;

import static ru.khlebnikova.calcApp.service.ResultWriterService.typeResult;
import static ru.khlebnikova.calcApp.util.Calculator.*;

public class _Main {

    public static void main(String[] args) {

        typeResult(15, 2, sum(15, 2), "sum");

        typeResult(15, 25, difference(15, 25), "difference");

        typeResult(15, 2, multiplication(15, 2), "multiplication");

    }

}
