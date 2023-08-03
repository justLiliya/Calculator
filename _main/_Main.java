package ru.khlebnikova.calcapp._main;

import static ru.khlebnikova.calcapp.service.ResultWriterService.typeResult;
import static ru.khlebnikova.calcapp.util.Calculator.*;

public class _Main {

    public static void main(String[] args) {

        typeResult(15, 2, sum(15, 2), "sum");
        typeResult(15, 25, difference(15, 25), "difference");
        typeResult(15, 2, multiplication(15, 2), "multiplication");

    }
}
