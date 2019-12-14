package by.training.loop.task5.controller;

//С помощью оператора while напишите программу определения суммы
// всех нечетных чисел в диапазоне от 1 до 99 включительно.

import by.training.loop.task5.model.SumOdd;

public class Runner {
    public static void main(String[] args) {

        System.out.println(new SumOdd().sumOfOdd(99));
    }
}
